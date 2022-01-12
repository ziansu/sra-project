private void loadTables() {
    tables = db.getTables();
    adapter.addAllUpdated(tables);
}