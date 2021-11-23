@java.lang.Override
protected void onPostResume() {
    super.onPostResume();
    loadDataFromDB();
    java.lang.System.out.println("Resuming");
    mAdapter.notifyDataSetChanged();
}