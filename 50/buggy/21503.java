@java.lang.Override
public void run() {
    getAllPPTFiles(android.os.Environment.getExternalStorageDirectory());
    mHandler.sendEmptyMessage(com.changhong.touying.activity.OtherDetailsActivity.PPTLIST_REFRESH);
}