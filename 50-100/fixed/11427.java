public static com.oracle.st.pm.json.movieTicketing.utilitiy.DBConnection getDBConnection() {
    try {
        java.lang.String filename = java.lang.System.getProperty("com.oracle.st.xmldb.pm.ConnectionParameters", com.oracle.st.pm.json.movieTicketing.utilitiy.DBConnection.DEFAULT_CONNECTION_DEFINITION);
        java.io.File connectionProperties = new java.io.File(filename);
        return com.oracle.st.pm.json.movieTicketing.utilitiy.DBConnection.gson.fromJson(new java.io.FileReader(connectionProperties), com.oracle.st.pm.json.movieTicketing.utilitiy.DBConnection.class);
    } catch (java.io.FileNotFoundException fnf) {
        return new com.oracle.st.pm.json.movieTicketing.utilitiy.DBConnection();
    }
}