private void addListViewListeners() {
    if ((this.context) instanceof com.albums.ui.AlbumListActivity) {
        com.albums.ui.AlbumListActivity albumListActivity = ((com.albums.ui.AlbumListActivity) (this.context));
        final com.albums.ui.dialog.AddAlbumDialog addAlbumDialog = new com.albums.ui.dialog.AddAlbumDialog(albumListActivity, this.currentAlbumList);
        albumListView.setOnItemLongClickListener(new android.widget.AdapterView.OnItemLongClickListener() {
            @java.lang.Override
            public boolean onItemLongClick(android.widget.AdapterView<?> parent, android.view.View view, final int position, long id) {
                addAlbumDialog.show(position);
                return true;
            }
        });
    }
}