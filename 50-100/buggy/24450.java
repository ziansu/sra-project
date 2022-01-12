@java.lang.Override
public void onItemClick(android.support.v7.widget.RecyclerView.Adapter adapter, android.view.View view, int position, long id) {
    android.util.Log.d("onItemClick", ((("position:" + position) + ", id:") + id));
    net.ltfc.chinaartgallery.base.model.entities.Painting painting = paintingListAdapter.getItem(position);
    android.content.Intent intent = new android.content.Intent(getContext(), net.ltfc.chinaartgallery.detail.view.DetailActivity.class);
    intent.putExtra(Constants.KEY_PAINTING, painting);
    startActivity(intent);
}