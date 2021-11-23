@java.lang.Override
protected void onResume() {
    super.onResume();
    invalidateOptionsMenu();
    recyclerView.setAdapter(adapter);
}