public void update(awana.database.Record r) {
    this.firstName = r.getField(1).getData();
    this.lastName = r.getField(2).getData();
}