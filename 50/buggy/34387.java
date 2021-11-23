private void sendStatusbarNotification(com.newscombinator.notifier.Doc doc) {
    if ((showNotification) == false) {
        android.util.Log.e(Consts.APP_TAG, "Not showing Notifiction because flag set");
        return ;
    }
    com.newscombinator.notifier.handler.NotificationHandler.getInstance(context).sendStatusbarNotification(doc);
}