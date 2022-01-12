public static org.giiwa.framework.bean.User load(java.lang.String name, java.lang.String password) {
    password = org.giiwa.framework.bean.User.encrypt(password);
    log.debug(((("name=" + name) + ", passwd=") + password));
    return org.giiwa.framework.bean.Bean.load(new com.mongodb.BasicDBObject("name", name).append("password", password).append("deleted", new com.mongodb.BasicDBObject("$ne", 1)), org.giiwa.framework.bean.User.class);
}