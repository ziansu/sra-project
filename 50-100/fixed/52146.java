@java.lang.Override
public void onClick(android.view.View v) {
    if (!(listDataHeader.contains(txtCategory.getText()))) {
        java.lang.String catText = java.lang.String.valueOf(txtCategory.getText());
        listDataHeader.add(catText);
        com.example.user.notes2go.Category nc = new com.example.user.notes2go.Category();
        nc.setCategoryName(catText);
        dbHelper.addCategory(nc);
    }else {
        android.widget.Toast.makeText(this, "This category exists. Please enter a new one", Toast.LENGTH_LONG).show();
    }
    refreshListView();
    dialog.dismiss();
}