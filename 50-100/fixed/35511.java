private void addColumn() {
    int columns = spreadsheetController.getNumberOfColumns();
    spreadsheetController.addColumn();
    for (int i = 0, j = table.getChildCount(); i < j; i++) {
        android.view.View view = table.getChildAt(i);
        if (view instanceof android.widget.TableRow) {
            android.widget.TableRow tr = ((android.widget.TableRow) (view));
            tr.addView(newCell(columns, i));
        }
    }
}