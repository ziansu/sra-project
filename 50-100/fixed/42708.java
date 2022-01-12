public void removeSortOptions() {
    if ((optionsMenu) != null) {
        android.view.MenuItem sortStop = optionsMenu.findItem(R.id.menu_sort_123);
        android.view.MenuItem sortName = optionsMenu.findItem(R.id.menu_sort_abc);
        if ((sortName != null) && (sortStop != null)) {
            sortName.setVisible(false);
            sortStop.setVisible(false);
            onPrepareOptionsMenu(optionsMenu);
        }
    }
}