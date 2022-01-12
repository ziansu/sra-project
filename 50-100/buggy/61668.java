private void resetItems() {
    if ((menuItems.size()) > 0) {
        java.util.List<android.view.ext.SatelliteMenuItem> items = new java.util.ArrayList<android.view.ext.SatelliteMenuItem>(menuItems);
        menuItems.clear();
        this.removeAllViews();
        addItems(items);
    }
}