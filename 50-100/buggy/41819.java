@java.lang.Override
public void run() {
    try {
        ru.allfound.webparsingserviceexample.WebParsing webParsing = new ru.allfound.webparsingserviceexample.WebParsing();
        java.lang.String result = webParsing.parsing(uri);
        android.content.Intent intent = new android.content.Intent().putExtra(MainActivity.PARAM_RESULT, result);
        pendingIntent.send(this, 0, intent);
        sendNotification(result);
    } catch (android.app.PendingIntent e) {
        e.printStackTrace();
    }
}