public boolean loadDBProperties() {
    java.lang.System.out.println((("Load \"" + (com.hiltondublin.db.HiltonDublinDBConnection.DB_PROPERTIES_FILENAME)) + "\""));
    java.io.InputStream input = null;
    input = getClass().getClassLoader().getResourceAsStream(com.hiltondublin.db.HiltonDublinDBConnection.DB_PROPERTIES_FILENAME);
    try {
        this.dbProperties.load(input);
    } catch (java.io.IOException e) {
        java.lang.System.out.println((("Failed to load \"" + (com.hiltondublin.db.HiltonDublinDBConnection.DB_PROPERTIES_FILENAME)) + "\""));
        e.printStackTrace();
        return false;
    }
    return true;
}