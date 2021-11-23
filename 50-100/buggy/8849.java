public java.sql.Connection estaConnection() throws com.info.ghiny.examsystem.tools.ProcessException {
    java.sql.Connection con = null;
    try {
        java.lang.Class.forName(curDriver);
        con = java.sql.DriverManager.getConnection(curAddress);
    } catch (java.lang.Exception err) {
        throw new com.info.ghiny.examsystem.tools.ProcessException((("FATAL: " + (err.getMessage())) + "\nPlease Consult Developer"), com.info.ghiny.examsystem.tools.ProcessException.FATAL_MESSAGE, com.info.ghiny.examsystem.tools.IconManager.WARNING);
    }
    return con;
}