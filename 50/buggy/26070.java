@java.lang.Override
public void onLoadFinished(Loader<List<? extends org.oucho.mpdclient.mpd.item.Item>> loader, List<? extends org.oucho.mpdclient.mpd.item.Item> albumList) {
    android.util.Log.i(org.oucho.mpdclient.fragments.AlbumSongsFragment.TAG, ("onLoadFinished " + albumList));
    mAdapter.setData(albumList);
}