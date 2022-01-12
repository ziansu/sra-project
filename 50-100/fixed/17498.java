public void createColumnInTable(Database.DB db, java.lang.String name, int pos) {
    Database.Table t = db.getTables().get(pos);
    Database.Column c = DatabaseFactory.eINSTANCE.createColumn();
    t.getColumns().add(c);
    c.setName(name);
}