public void showGeoPointEditDialog(de.k3b.android.locationMapViewer.geobmp.GeoBmpDto geoPointInfo) {
    if ((this.edit) == null) {
        this.edit = new de.k3b.android.locationMapViewer.geobmp.GeoBmpEditDialog(this.context, this, R.layout.geobmp_edit_name);
        this.edit.setTitle(context.getString(R.string.title_bookmark_edit));
    }
    if (!(de.k3b.android.locationMapViewer.geobmp.BookmarkUtil.isBookmark(geoPointInfo))) {
        geoPointInfo = de.k3b.android.locationMapViewer.geobmp.BookmarkUtil.createBookmark(geoPointInfo);
    }
    this.edit.onGeoInfo(geoPointInfo);
    this.context.showDialog(de.k3b.android.locationMapViewer.geobmp.BookmarkListOverlay.EDIT_MENU_ID);
}