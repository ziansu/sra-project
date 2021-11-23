@java.lang.Override
protected java.lang.String getSQL() {
    return androidSQLiteSt.toString().substring("SQLiteProgram: ".length());
}