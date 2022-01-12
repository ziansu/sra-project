@java.lang.Override
public void onLoaded(java.util.List<net.ltfc.chinaartgallery.base.model.entities.Painting> paintingList) {
    android.util.Log.i("onLoaded", ("category:" + (category)));
    paintingListAdapter.setPaintingList(paintingList);
    swipeRefresh.setRefreshing(false);
}