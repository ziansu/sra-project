private void addNotAddedRighRows(java.util.Set<model.process.setOperations.Row> rightAdd) {
    for (model.process.setOperations.DataRow rightRow : ((java.lang.Iterable<model.process.setOperations.DataRow>) (right))) {
        if (!(rightAdd.contains(right))) {
            createRow(new model.process.setOperations.DataRow(), rightRow);
        }
    }
}