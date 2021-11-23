public static android.content.Intent newIntent(android.content.Context packageContext, java.util.UUID jobId) {
    android.util.Log.d(com.osu.cse5236.oddjobs.EditJobActivity.TAG, "newIntent() called");
    android.content.Intent intent = new android.content.Intent(packageContext, com.osu.cse5236.oddjobs.NewJobActivity.class);
    return intent;
}