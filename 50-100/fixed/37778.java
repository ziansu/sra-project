@java.lang.Override
public void over(com.liulishuo.filedownloader.BaseDownloadTask task) {
    android.util.Log.e("TAGX", ((("taskCount:" + taskCount) + "finishedtaskcount:") + (finishedTaskCount)));
    ++(finishedTaskCount);
    if ((finishedTaskCount) == taskCount) {
        if (isFirstTime) {
            startActivity(mIntentIntro);
            finish();
        }else {
            startActivity(mIntent);
            finish();
        }
    }
}