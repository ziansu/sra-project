public void clickedPlus(android.view.View v) {
    lastClickedRowArray = new java.util.ArrayList<java.lang.String>();
    currentlySelectedRow.setBackgroundResource(0);
    for (com.izzygomez.workr.ListedItem item : listItems) {
        if (item.isSelected()) {
            item.toggleSelection();
        }
    }
    currentlySelectedListItem = null;
    goToTaskInputScreen();
}