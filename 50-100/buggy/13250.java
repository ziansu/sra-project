@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    actualViewHolder.mainView.setSelected(false);
    boolean returnVal = iRecyclerActivity.editItem(selectedItem);
    selectedItem = -1;
    actualViewHolder = null;
    recyclerPosition = -1;
    swipingEnabled = true;
    iRecyclerActivity.getEditMenu().setVisible(false);
    return returnVal;
}