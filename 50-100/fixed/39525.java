public void setReminder(android.view.View v) {
    android.view.View parentRow = ((android.view.View) (v.getParent()));
    android.widget.ExpandableListView explistView = ((android.widget.ExpandableListView) (parentRow.getParent()));
    final int position = explistView.getPositionForView(parentRow);
    android.widget.Toast.makeText(this, "hi", Toast.LENGTH_LONG);
}