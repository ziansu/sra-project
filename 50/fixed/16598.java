@java.lang.Override
protected void registerSQLKeyWords() {
    super.registerSQLKeyWords();
    this.sqlKeyWords.addAll(java.util.Arrays.asList(leap.db.platform.mysql.MySql5Dialect.NONSQL92_RESERVED_WORDS));
}