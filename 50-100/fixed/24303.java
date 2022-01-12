@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent intent) {
    if (resultCode == (RESULT_OK)) {
        if (requestCode == (com.iwebnext.vchatt.activity.AttachVideoActivity.REQUEST_CODE_SELECT_VIDEO)) {
            android.net.Uri selectedVideoUri = intent.getData();
            selectedPath = getPath(selectedVideoUri);
            textView.setText(selectedPath);
            attachVideo.setVideoURI(selectedVideoUri);
            attachVideo.start();
        }
    }
}