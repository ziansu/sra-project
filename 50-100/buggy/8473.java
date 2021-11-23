public void onClick(android.content.DialogInterface dialog, int id) {
    android.widget.ListView lw = ((android.app.AlertDialog) (dialog)).getListView();
    int selected = ((java.lang.Integer) (lw.getTag()));
    exportExpensesXLS(selected);
    dialog.cancel();
}