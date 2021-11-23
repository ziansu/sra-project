@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    isPaused = true;
    chronometerClick();
    dialog.dismiss();
    immersiveMode();
}