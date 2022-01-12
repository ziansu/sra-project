@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    android.util.Log.e(com.fenix.audioplayer.MainActivity.TEST, "Check2");
    if (resultCode == (RESULT_OK)) {
        switch (requestCode) {
            case com.fenix.audioplayer.MainActivity.REQUEST_FOLDER :
                com.fenix.audioplayer.MainActivity.sPath = data.getStringExtra(com.fenix.audioplayer.MainActivity.FOLDER_NAME);
                searchMedia(getArgs(com.fenix.audioplayer.MainActivity.sPath), null);
                mHandler.removeMessages(com.fenix.audioplayer.MainActivity.TICK_WHAT);
                mAdapter.setmData(null);
                mPlayerControl.setVisibility(View.GONE);
                mBoundService.stopPlay();
                mBoundService.setPosition(0);
                break;
        }
    }
}