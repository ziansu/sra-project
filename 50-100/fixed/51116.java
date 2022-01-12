protected void delete(java.lang.String table, java.lang.String whereClause, java.lang.String[] whereArgs) throws java.lang.Exception {
    if (table == null)
        throw new java.lang.Exception("El nombre de la tabla no puede estar vacío");
    
    whereClause = putWhereArgs(whereClause, whereArgs);
    int r = ((int) (this.executeStatement(((("DELETE FROM " + table) + whereClause) + ";"), true)));
}