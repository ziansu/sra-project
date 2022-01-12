private void filterCells() {
    javax.swing.RowFilter<javax.swing.table.TableModel, java.lang.Object> rf = null;
    try {
        rf = javax.swing.RowFilter.regexFilter(filterText.getText(), java.util.stream.IntStream.rangeClosed(1, table.getColumnCount()).toArray());
    } catch (java.util.regex.PatternSyntaxException e) {
        return ;
    }
    sorter.setRowFilter(rf);
}