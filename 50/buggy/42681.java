@java.lang.Override
protected void onHandleIntent(@android.support.annotation.Nullable
android.content.Intent intent) {
    if (!(isLoading))
        urlLink = intent.getStringExtra("urlLink");
    
    isWhich = intent.getStringExtra("isWhich");
    connectToApi();
}