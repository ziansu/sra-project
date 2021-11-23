@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    super.onPostExecute(result);
    if (pDialog.isShowing())
        pDialog.dismiss();
    
    android.widget.ListAdapter adapter = new android.widget.SimpleAdapter(this, contactList, R.layout.hwlist_item, new java.lang.String[]{ "Class" , "Subject" , "Title" , "Description" , "postDate" , "deadLine" }, new int[]{ R.id.Class , R.id.Subject , R.id.Title , R.id.Description , R.id.postDate , R.id.deadLine });
    lv.setAdapter(adapter);
}