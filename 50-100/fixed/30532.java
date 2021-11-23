@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<java.util.List<? extends org.oucho.mpdclient.mpd.item.Item>> loader, java.util.List<? extends org.oucho.mpdclient.mpd.item.Item> albumList) {
    if ((!(org.oucho.mpdclient.fragments.AlbumListFragment.antiReload)) && (albumList != null)) {
        mAdapter.setData(albumList);
        org.oucho.mpdclient.fragments.AlbumListFragment.mAlbumsList = albumList;
        org.oucho.mpdclient.fragments.AlbumListFragment.antiReload = true;
    }
    mLoadingView.setVisibility(View.GONE);
}