private void addListViewListeners() {
    if ((this.context) instanceof com.albums.ui.AlbumListActivity) {
        albumListView.setOnItemLongClickListener(new android.widget.AdapterView.OnItemLongClickListener() {
            @java.lang.Override
            public boolean onItemLongClick(android.widget.AdapterView<?> parent, android.view.View view, final int position, long id) {
                com.albums.ui.AlbumListActivity albumListActivity = ((com.albums.ui.AlbumListActivity) (context));
                java.lang.System.out.println(currentAlbumList.get(0));
                com.albums.ui.dialog.AddAlbumDialog addAlbumDialog = new com.albums.ui.dialog.AddAlbumDialog(albumListActivity, currentAlbumList);
                addAlbumDialog.show(position);
                return true;
            }
        });
    }
}