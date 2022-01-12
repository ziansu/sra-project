@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    android.app.NotificationManager nManager = ((android.app.NotificationManager) (getSystemService(Context.NOTIFICATION_SERVICE)));
    me.johannesnz.smsim.Main.sendMessage("DC");
    nManager.cancel(1);
    me.johannesnz.smsim.Main.sender.detachDuplexOutputChannel();
}