@java.lang.Override
public void onClick(android.view.View v) {
    int position = ((java.lang.Integer) (v.getTag()));
    steinbacher.georg.storj_hoststats_app.StorjNode selectedNode = ((steinbacher.georg.storj_hoststats_app.StorjNode) (mListView.getAdapter().getItem(position)));
    showEditNowDialog(selectedNode, position);
}