public void set(org.md2k.ema_scheduler.configuration.EMAType emaType, org.md2k.ema_scheduler.delivery.Callback callback) {
    org.md2k.utilities.Report.Log.d(org.md2k.ema_scheduler.notifier.NotifierManager.TAG, "set()...");
    this.emaType = emaType;
    this.notifications = emaType.getNotifications();
    this.callbackDelivery = callback;
    org.md2k.utilities.Report.Log.d(org.md2k.ema_scheduler.notifier.NotifierManager.TAG, "before runnableSubscribe..");
    handlerSubscribe.post(runnableSubscribe);
    lastAckTime = 0;
    lastInsertTime = 0;
    notifyNo = 0;
    delayEnable = true;
}