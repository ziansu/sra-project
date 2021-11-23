public void updateViews(com.darrienglasser.clockwork.AlarmData data) {
    android.util.Log.d("DGl", "Updating views...");
    mGridView.invalidateViews();
    ((com.darrienglasser.clockwork.AlarmAdapter) (mGridView.getAdapter())).updateData(data);
}