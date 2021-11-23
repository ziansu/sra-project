@java.lang.Override
public void onNotificationClicked(java.util.List<com.gimbal.android.Communication> communications) {
    for (com.gimbal.android.Communication communication : communications) {
        if (communication != null) {
            addEvent(java.lang.String.format("Communication Clicked"));
        }
    }
}