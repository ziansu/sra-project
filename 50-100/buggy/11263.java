private void addRow(java.lang.String[] row) {
    for (int i = 0; i < (nOfColumns); ++i) {
        data.addEntity(new org.online.etl.model.abstractions.Entity(currentId, ((long) (i)), "", "String", ""));
    }
}