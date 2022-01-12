@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (com.example.profilecloudexample.MainActivity.REQUEST_ENABLE_BT)) {
        if (resultCode == (android.app.Activity.RESULT_OK)) {
            com.emotiv.insight.IEdk.IEE_EngineConnect(this, "");
            processingThread.start();
        }
        if (resultCode == (android.app.Activity.RESULT_CANCELED)) {
            android.widget.Toast.makeText(this, "You must be turn on bluetooth to connect with Emotiv devices", Toast.LENGTH_SHORT).show();
        }
    }
}