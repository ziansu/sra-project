@java.lang.Override
public void onLoadFinished(Loader<List<? extends org.oucho.mpdclient.mpd.item.Item>> loader, List<? extends org.oucho.mpdclient.mpd.item.Item> albumList) {
    mAdapter.setData(albumList);
}