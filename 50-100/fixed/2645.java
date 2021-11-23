@java.lang.Override
public void onClick(android.view.View v) {
    if (!(penaltyYdsEditText.getText().toString().equals(""))) {
        globalPlay.setGnLs(java.lang.Integer.parseInt(penaltyYdsEditText.getText().toString()));
        globalPlay.setDefensivePenalty(defenseCB.isChecked());
        globalPlay.setYdLn(java.lang.Integer.parseInt(ydLnEditText.getText().toString()));
    }
    flow = false;
    newPlayDialog();
    dialog.dismiss();
}