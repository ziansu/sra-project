@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (yesListener != null)
        yesListener.onClick(dialog, which);
    
    displayedAlerts.remove(message);
}