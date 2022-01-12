public static org.giiwa.framework.bean.Beans<org.giiwa.framework.bean.User> load(org.giiwa.core.bean.Helper.W q, int offset, int limit) {
    return org.giiwa.framework.bean.Helper.load(q.sort("name", 1), offset, limit, org.giiwa.framework.bean.User.class);
}