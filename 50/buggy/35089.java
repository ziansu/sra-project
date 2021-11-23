public void clear() {
    android.util.Log.d("GuideCreateActivity", "Clearing");
    mGuides.clear();
    notifyDataSetChanged();
}