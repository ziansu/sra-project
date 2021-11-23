private void selectAllRows(boolean selected) {
    if (isRowSelectionEnabled) {
        java.util.List<R> sublist = dataProvider.getList().subList(1, dataProvider.getList().size());
        for (R row : sublist) {
            selectionModel.setSelected(row, selected);
        }
    }
}