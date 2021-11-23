@org.robolectric.annotation.Implementation
public void send() throws android.app.PendingIntent.CanceledException {
    send(savedContext, 0, null);
}