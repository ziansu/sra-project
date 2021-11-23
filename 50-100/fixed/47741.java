@java.lang.Override
protected void onPostExecute(com.QuarkLabs.BTCeClient.api.CallResult<com.QuarkLabs.BTCeClient.api.AccountInfo> result) {
    java.lang.String notificationText;
    if (!(isVisible())) {
        return ;
    }
    if (result.isSuccess()) {
        notificationText = getString(R.string.FundsInfoUpdatedtext);
        refreshFundsView(result.getPayload().getFunds());
    }else {
        notificationText = result.getError();
    }
    if ((activityCallback) != null) {
        activityCallback.makeNotification(ConstantHolder.ACCOUNT_INFO_NOTIF_ID, notificationText);
    }
}