@java.lang.Override
public com.jfinal.plugin.activerecord.Page<io.jpress.model.User> onIndexDataLoad(int pageNumber, int pageSize) {
    setAttr("userCount", io.jpress.model.query.UserQuery.me().findCount());
    setAttr("adminCount", io.jpress.model.query.UserQuery.me().findAdminCount());
    return io.jpress.model.query.UserQuery.me().paginate(pageNumber, pageSize, null);
}