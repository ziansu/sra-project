public void addRow() {
    int rows = spreadsheetController.getNumberOfRows();
    int columns = spreadsheetController.getNumberOfColumns();
    spreadsheetController.addRow();
    android.widget.TableRow tr = new android.widget.TableRow(getApplicationContext());
    tr.setLayoutParams(new android.widget.TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.WRAP_CONTENT));
    for (int i = 0; i < columns; i++) {
        tr.addView(newCell(i, rows));
    }
    table.addView(tr, new android.widget.TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
}