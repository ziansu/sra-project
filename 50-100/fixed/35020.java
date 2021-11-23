@java.lang.Override
public void onClick(android.view.View v) {
    if (notifsEnabled)
        tv1.setText(("[   ] " + (getText(R.string.first_disclaimer_notifs))));
    else
        tv1.setText(("[X] " + (getText(R.string.first_disclaimer_notifs))));
    
    notifsEnabled = !(notifsEnabled);
}