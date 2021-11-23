@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.BTN___MAIN___STARTCAPTURE :
            break;
    }
    switch (v.getId()) {
        case R.id.BTN___MAIN___TAKESHOT :
            android.util.Log.i(com.example.lore_f.cameracontrol.MainActivity.TAG, "TAKE SHOT requested.");
            mCamera.takePicture(null, null, takeShotCallBack);
            startCameraPreview();
            break;
    }
}