@java.lang.Override
public void run() {
    getAllPPTFiles(android.os.Environment.getExternalStorageDirectory(), 0);
    mHandler.sendEmptyMessage(com.changhong.touying.activity.OtherDetailsActivity.PPTLIST_REFRESH);
}