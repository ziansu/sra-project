public static com.oracle.st.pm.json.movieTicketing.utilitiy.DBConnection getDBConnection() {
    try {
        java.lang.String filename = java.lang.System.getProperty("com.oracle.st.xmldb.pm.ConnectionParameters", com.oracle.st.pm.json.movieTicketing.utilitiy.DBConnection.DEFAULT_CONNECTION_DEFINITION);
        java.io.File connectionProperties = new java.io.File(filename);
        java.lang.System.out.println(((((com.oracle.st.pm.json.movieTicketing.utilitiy.DBConnection.sdf.format(new java.util.Date())) + "[DBConnection.getDBConnection()]: Using connection properties file + \"") + (connectionProperties.getAbsolutePath())) + "\"."));
        return com.oracle.st.pm.json.movieTicketing.utilitiy.DBConnection.gson.fromJson(new java.io.FileReader(connectionProperties), com.oracle.st.pm.json.movieTicketing.utilitiy.DBConnection.class);
    } catch (java.io.FileNotFoundException fnf) {
        return new com.oracle.st.pm.json.movieTicketing.utilitiy.DBConnection();
    }
}