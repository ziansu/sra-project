@java.lang.Override
protected void onListItemClick(android.widget.ListView l, org.cnx.android.activity.View v, int position, long id) {
    org.cnx.android.beans.Content content = ((org.cnx.android.beans.Content) (getListView().getItemAtPosition(position)));
    android.content.Intent intent = new android.content.Intent(currentContext, org.cnx.android.activity.ViewLensActivity.class);
    org.cnx.android.utils.ContentCache.setObject(getString(R.string.cache_sentcontent), content);
    intent.putExtra(getString(R.string.cache_sentcontent), content);
    startActivity(intent);
}