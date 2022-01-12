public static android.content.Intent createUpdateButtonAction(ir.mbaas.sdk.logic.UpdateActions.UpdateActionType updateActionType, ir.mbaas.sdk.models.MBaaSAppVersion appVersion, int notificationId) {
    android.content.Intent intent = new android.content.Intent(ir.mbaas.sdk.MBaaS.context, ir.mbaas.sdk.receivers.UpdateButtonReceiver.class);
    intent.putExtra(AppConstants.UD_ACTION_TYPE, updateActionType);
    intent.putExtra(AppConstants.UD_DOWNLOAD_URL, appVersion.downloadUrl);
    intent.putExtra(AppConstants.APP_NOTIFICATION_ID, notificationId);
    return intent;
}