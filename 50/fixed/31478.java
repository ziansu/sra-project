@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (com.ensipoly.events.activities.MapsActivity.SETTING_CODE))
        createLocationRequest(false);
    else
        super.onActivityResult(requestCode, resultCode, data);
    
}