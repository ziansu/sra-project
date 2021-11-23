private void hideOption(int id) {
    if ((mOptionsMenu) != null) {
        android.view.MenuItem item = mOptionsMenu.findItem(id);
        item.setVisible(false);
    }
}