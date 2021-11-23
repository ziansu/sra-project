@java.lang.Override
protected void onStart() {
    super.onStart();
    this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    listView = ((android.widget.ListView) (findViewById(R.id.tracking_list)));
    refreshList();
}