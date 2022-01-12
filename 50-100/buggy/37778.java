@java.lang.Override
public void over(com.liulishuo.filedownloader.BaseDownloadTask task) {
    android.util.Log.e("TAGX", ((("taskCount:" + taskCount) + "finishedtaskcount:") + (finishedTaskCount)));
    if ((finishedTaskCount) < taskCount) {
        ++(finishedTaskCount);
    }else {
        if (isFirstTime) {
            startActivity(mIntentIntro);
            finish();
        }else {
            startActivity(mIntent);
            finish();
        }
    }
}