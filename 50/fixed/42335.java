@java.lang.Override
protected void onResume() {
    super.onResume();
    recyclerView.setAdapter(adapter);
}