public void refreshData() {
    adapter.removeAll();
    progressBar.setVisibility(View.VISIBLE);
    startService();
    adapter.notifyDataSetChanged();
}