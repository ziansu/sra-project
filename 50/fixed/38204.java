@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int whichButton) {
    mTimer.cancel();
    modifyBootIni();
}