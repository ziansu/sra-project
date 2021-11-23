private void selectItem(int position) {
    if ((leftDrawerListView) != null) {
        leftDrawerListView.setItemChecked(position, true);
        navigationItems.get(currentSelectedPosition).setSelected(false);
        navigationItems.get(position).setSelected(true);
        currentSelectedPosition = position;
        getSupportActionBar().setTitle(navigationItems.get(currentSelectedPosition).getItemName());
    }
    if ((mLinearDrawerLayout) != null) {
    }
}