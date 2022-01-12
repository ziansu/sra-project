@java.lang.Override
public void handleMessageSafe(au.org.intersect.faims.android.ui.activity.ShowModuleActivity activity, android.os.Message message) {
    activity.hideBusyDialog();
    au.org.intersect.faims.android.net.Result result = ((au.org.intersect.faims.android.net.Result) (message.obj));
    if ((result.resultCode) == (au.org.intersect.faims.android.net.FAIMSClientResultCode.SUCCESS)) {
        beanShellLinker.execute(callback);
    }else
        if ((result.resultCode) == (au.org.intersect.faims.android.net.FAIMSClientResultCode.FAILURE)) {
            activity.showUploadDatabaseFailureDialog(callback);
        }else {
        }
    
}