public void onClick(android.view.View v) {
    globalPlay.setFgMadeFlag(goodCB.isChecked());
    globalPlay.setFgDistance(java.lang.Integer.parseInt(fgDistanceEditText.getText().toString()));
    if (!(kickerEditText.getText().toString().equals(""))) {
        globalPlay.setPlayerNumber(java.lang.Integer.parseInt(kickerEditText.getText().toString()));
    }
    flow = true;
    newPlayDialog();
    dialog.dismiss();
}