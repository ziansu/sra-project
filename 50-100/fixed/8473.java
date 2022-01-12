public void onClick(android.content.DialogInterface dialog, int id) {
    android.widget.ListView lw = ((android.app.AlertDialog) (dialog)).getListView();
    int selected = -1;
    if ((lw.getTag()) != null) {
        selected = ((java.lang.Integer) (lw.getTag()));
    }
    exportExpensesXLS(selected);
}