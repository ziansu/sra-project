public com.jfinal.plugin.activerecord.Page<io.jpress.model.Content> doPaginateByModule(int page, int pagesize, java.lang.String module) {
    return doPaginate(pagesize, pagesize, module, null, 0, 0, null);
}