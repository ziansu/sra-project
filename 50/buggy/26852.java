private java.lang.String getSQL() {
    return androidSQLiteSt.toString().substring("SQLiteProgram: ".length());
}