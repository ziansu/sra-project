@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    progressDialog.dismiss();
    com.kidusmt.android.rssparser.MyAdapter adapter = new com.kidusmt.android.rssparser.MyAdapter(context, feedItems);
    recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(context));
    recyclerView.setAdapter(adapter);
    super.onPostExecute(aVoid);
}