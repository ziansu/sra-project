public void setMenuItem(android.view.MenuItem menuItem) {
    this.menuItem = menuItem;
    if ((imageView) != null) {
        menuItem.setActionView(imageView);
        if (startAnimation) {
            startAnimation();
        }
    }
}