@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    stopService(de.jamsk.mrx.MrXMap.startMrXService);
    de.jamsk.mrx.MrXMap.gameFinished.show();
    new de.jamsk.mrx.MrXMap.endGame();
    dialog.cancel();
}