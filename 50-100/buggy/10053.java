protected void insert(java.lang.String table, java.util.HashMap<java.lang.String, java.lang.String> values) throws java.lang.Exception {
    if (table == null)
        throw new java.lang.Exception("El nombre de la tabla no puede estar vacío");
    
    java.lang.String insertBody = putBody(values);
    int r = ((int) (this.executeStatement((((("INSERT INTO " + table) + " SET ") + insertBody) + ";"), true)));
    this.close();
    java.lang.System.out.println(("Rows affected: " + r));
}