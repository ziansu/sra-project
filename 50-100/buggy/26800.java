@java.lang.Override
protected void onStart() {
    super.onStart();
    if (!(hasInternetConnection())) {
        android.content.Intent noInternetIntent = new android.content.Intent(this, com.example.visvikis.f1story.NoConnectionActivity.class);
        startActivity(noInternetIntent);
        finish();
    }else
        if (!(searchedForUpdates)) {
            checkFrag.checkForUpdates();
        }
    
}