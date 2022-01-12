@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    game.setmTitle(presetName[0]);
    createPreset();
    dialog.dismiss();
    displaySpinner(mSpinnerPreset, presetStringArray());
}