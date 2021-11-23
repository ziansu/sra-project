@java.lang.Override
public void finish() {
    super.finish();
    overridePendingTransition(0, android.R.anim.fade_out);
    com.videobox.main.DownloadTubeRecomActivity.launch(mContext);
}