@java.lang.Override
protected void onResume() {
    super.onResume();
    android.util.Log.i("back", "back key pressed?");
    try {
        android.content.Intent intent = getIntent();
        placeList.addAll(intent.getStringArrayListExtra("savedPlaces"));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        android.util.Log.i("info", "Failed to get savedPlaces");
    }
}