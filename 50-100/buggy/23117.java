public void addTable(simpledb.DbFile file, java.lang.String name, java.lang.String pkeyField) {
    if (name == null) {
        java.lang.System.out.println("ERROR: Name provided is Null");
    }else
        if (nameToTable.containsKey(name)) {
            java.lang.System.out.println("ERROR: Name conflict. Name key already used. Ditching new table.");
        }else {
            simpledb.Catalog.Table newTable = new simpledb.Catalog.Table(file.getId(), name, file, pkeyField);
            nameToTable.put(name, newTable);
            idToTable.put(file.getId(), newTable);
        }
    
}