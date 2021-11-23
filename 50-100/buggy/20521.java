private it.unibas.spicy.persistence.sql.ExportSQLInstances.TableSchema searchTableName(java.lang.String tableName, java.util.ArrayList<it.unibas.spicy.persistence.sql.ExportSQLInstances.TableSchema> t) {
    for (int i = 0; i < (t.size()); i++) {
        if (tableName.equals(t.get(i).getName())) {
            return t.get(i);
        }
    }
    java.lang.System.out.println("Den vrika ton pinaka");
    return null;
}