@java.lang.Override
public void onDestroy() {
    if (!(result)) {
        org.catrobat.catroid.utils.ToastUtil.showError(this, (((getResources().getText(R.string.error_project_upload).toString()) + " ") + (serverAnswer)));
        org.catrobat.catroid.utils.StatusBarNotificationManager.getInstance().showUserUploadFailedNotification(notificationId, statusCode, serverAnswer, mBundle);
    }else {
        org.catrobat.catroid.utils.ToastUtil.showSuccess(this, R.string.notification_upload_finished);
    }
    super.onDestroy();
}