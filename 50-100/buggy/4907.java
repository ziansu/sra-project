private void addRowsToView() {
    calorieTable.addView(tableHeaderRow, new android.widget.TableLayout.LayoutParams(android.widget.TableRow.LayoutParams.WRAP_CONTENT, android.widget.TableRow.LayoutParams.WRAP_CONTENT));
    for (int i = 0; i < (tableRows.size()); i++) {
        calorieTable.addView(tableRows.get(i), new android.widget.TableLayout.LayoutParams(android.widget.TableRow.LayoutParams.WRAP_CONTENT, android.widget.TableRow.LayoutParams.WRAP_CONTENT));
    }
}