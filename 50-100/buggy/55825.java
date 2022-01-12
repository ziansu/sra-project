private java.lang.String getInputTextFromIntent(android.content.Intent intent, org.infobip.mobile.messaging.interactive.NotificationAction notificationAction) {
    if ((notificationAction == null) || (!(notificationAction.hasInput()))) {
        return null;
    }
    android.os.Bundle input = android.support.v4.app.RemoteInput.getResultsFromIntent(intent);
    java.lang.CharSequence sequence = input.getCharSequence(notificationAction.getId());
    return sequence != null ? sequence.toString() : "";
}