@java.lang.Override
protected void onStart() {
    super.onStart();
    listView = ((android.widget.ListView) (findViewById(R.id.tracking_list)));
    refreshList();
}