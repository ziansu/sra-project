@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.manual :
            break;
        case R.id.parking :
            break;
        case R.id.auto :
            android.content.Intent changeToCamera = new android.content.Intent(getApplicationContext(), pegasus.bluetootharduino.CameraActivity.class);
            startActivity(changeToCamera);
            break;
        case R.id.advanced :
            android.content.Intent changeToSettings = new android.content.Intent(getApplicationContext(), pegasus.bluetootharduino.AdvSettingsActivity.class);
            startActivity(changeToSettings);
            break;
    }
}