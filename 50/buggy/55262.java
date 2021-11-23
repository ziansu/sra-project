private void refreshActionBar() {
    menu.findItem(R.id.deleteMenuItem).setVisible(((selectedTagsList.size()) > 0));
    setTitle();
}