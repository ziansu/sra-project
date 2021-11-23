private void refreshActionBar() {
    if ((menu) != null)
        menu.findItem(R.id.deleteMenuItem).setVisible(((selectedTagsList.size()) > 0));
    
    setTitle();
}