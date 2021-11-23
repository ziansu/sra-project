private void createFirstRow() {
    for (int i = 0; i < (nOfColumns); ++i) {
        data.addEntity(new org.online.etl.model.abstractions.Entity(currentId, (-1L), ("Col" + i), "String", ""));
    }
    currentId = nOfColumns;
}