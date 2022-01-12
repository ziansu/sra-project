@java.lang.Override
public void handleMessage(android.os.Message msg) {
    if ((progress) != null) {
        progress.dismiss();
    }
    switch (msg.what) {
        case com.airplayer.activity.fetchpicture.FetchPictureActivity.MSG_DOWNLOAD_PICTURE_SUCCEED :
            setResult(com.airplayer.activity.fetchpicture.RESULT_OK, null);
            onBackPressed();
            break;
        case com.airplayer.activity.fetchpicture.FetchPictureActivity.MSG_DOWNLOAD_PICTURE_FAIL :
            mSwipeRefreshLayout.setRefreshing(false);
            android.widget.Toast.makeText(this, "download picture fail, picture source might not exist", Toast.LENGTH_SHORT).show();
            break;
        case com.airplayer.activity.fetchpicture.FetchPictureActivity.MSG_DOWNLOAD_IMAGE_URL_FAIL :
            android.widget.Toast.makeText(this, "download fail, please check out network connection", Toast.LENGTH_SHORT).show();
    }
}