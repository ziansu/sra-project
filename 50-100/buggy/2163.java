private void sendUpdate() {
    mTransactionns = com.oyyx.weektag.TransactionLab.get().getTransactionns();
    android.content.Intent updateIntent = new android.content.Intent("android.appwidget.action.APPWIDGET_UPDATE_SERVICE");
    updateIntent.putExtra("transaction", mTransactionns.get(com.oyyx.weektag.WidgetService.position));
    mContext.sendBroadcast(updateIntent);
    (com.oyyx.weektag.WidgetService.position)++;
    if ((com.oyyx.weektag.WidgetService.position) == (mTransactionns.size())) {
        com.oyyx.weektag.WidgetService.position = 0;
    }
}