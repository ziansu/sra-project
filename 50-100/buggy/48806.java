@java.lang.Override
public model.User login(java.lang.String username, java.lang.String password) {
    java.util.List<model.User> u = ((java.util.List<model.User>) (this.getHibernateTemplate().find("from User where username=? and password=?", username, password)));
    java.lang.System.out.println(username);
    java.lang.System.out.println(("usersize" + (u.size())));
    if ((u.size()) > 0) {
        return u.get(0);
    }
    return null;
}