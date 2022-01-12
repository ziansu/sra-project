@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    yesListener.onClick(dialog, which);
    displayedAlerts.remove(message);
}