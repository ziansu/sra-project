public java.util.ArrayList<java.lang.String> getTables() {
    java.util.ArrayList<ragnardb.parser.ast.TableOrSubquery> tables = _primary.getTablesAndSubqueries();
    java.util.ArrayList<java.lang.String> out = new java.util.ArrayList<>();
    for (ragnardb.parser.ast.TableOrSubquery table : tables) {
        out.add(table.getName());
    }
    return out;
}