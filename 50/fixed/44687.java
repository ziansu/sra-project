@java.lang.Override
protected void onPostResume() {
    super.onPostResume();
    loadDataFromDB();
    java.lang.System.out.println("Resuming");
    if ((mAdapter) != null) {
        mAdapter.notifyDataSetChanged();
    }
}