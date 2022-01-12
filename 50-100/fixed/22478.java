@java.lang.Override
public void onClick(android.view.View v) {
    steinbacher.georg.storj_hoststats_app.StorjNode selectedNode = ((steinbacher.georg.storj_hoststats_app.StorjNode) (mListView.getAdapter().getItem(position)));
    android.content.Intent storjNodeDetailIntent = new android.content.Intent(this, steinbacher.georg.storj_hoststats_app.StorjNodeDetailActivity.class);
    storjNodeDetailIntent.putExtra(StorjNodeDetailActivity.EXTRA_NODEID, selectedNode.getNodeID());
    mContext.startActivity(storjNodeDetailIntent);
}