@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    actualViewHolder.mainView.setSelected(false);
    actualViewHolder = null;
    recyclerPosition = -1;
    swipingEnabled = true;
    iRecyclerActivity.getEditMenu().setVisible(false);
    boolean returnVal = iRecyclerActivity.editItem(selectedItem);
    selectedItem = -1;
    return returnVal;
}