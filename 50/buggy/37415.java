public void onClick(android.view.View view) {
    pager.setCurrentItem(getItem((-1)), true);
    updateButtonVisibility();
}