public static void createDbIfAbsent() throws java.io.IOException, java.sql.SQLException {
    java.lang.String currentDir = java.lang.System.getProperty("user.dir");
    java.lang.String propsPath = "/src/main/resources/application-prod.properties";
    java.lang.String[] elems = com.me.core.service.dao.DbCreationUtility.readProperties((currentDir + propsPath));
    java.lang.String url = elems[0];
    java.lang.String user = elems[1];
    java.lang.String password = elems[2];
    com.me.core.service.dao.DbCreationUtility.createIfAbsent(url, user, password);
}