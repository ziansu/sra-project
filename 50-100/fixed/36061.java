public void updateHeaderPadding(boolean show) {
    if (show) {
        header.setPadding(0, ((int) (getResources().getDimension(R.dimen.toolbar_height))), 0, 0);
    }else {
        header.setPadding(0, 0, 0, 0);
    }
}