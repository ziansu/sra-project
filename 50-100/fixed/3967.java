public static void createDbIfAbsent() throws java.io.IOException, java.sql.SQLException {
    java.lang.String[] elems = com.me.core.service.dao.DbCreationUtility.readProperties();
    java.lang.String url = elems[0];
    java.lang.String user = elems[1];
    java.lang.String password = elems[2];
    com.me.core.service.dao.DbCreationUtility.createIfAbsent(url, user, password);
}