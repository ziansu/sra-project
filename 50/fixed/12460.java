public com.eweblib.dbhelper.DataBaseQueryBuilder leftJoin(java.lang.String leftTable, java.lang.String rightTable, java.lang.String leftKey, java.lang.String rightKey) {
    return this.leftJoin(leftTable, leftTable, rightTable, rightTable, leftKey, rightKey);
}