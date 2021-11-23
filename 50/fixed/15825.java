public static void loadDriver() {
    try {
        java.lang.Class.forName("com.mysql.jdbc.Driver").newInstance();
    } catch (java.lang.Exception ex) {
    }
}