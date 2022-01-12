@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    needToShowProgress = false;
    setContentView(R.layout.activity_comments);
    boolean gotData = getDataFromIntentOrState(savedInstanceState);
    if (!gotData) {
        android.util.Log.e(ru.hookahlocator.hooklocator.CommentsActivity.TAG, "No data can be found!");
        finish();
    }
    dataProvider.getPlaceFullInfoAsync(this, placeId);
    loadData();
}