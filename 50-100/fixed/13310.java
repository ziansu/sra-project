public void onClick(android.view.View v) {
    if (goodCB.isChecked()) {
        globalPlay.setFgMadeFlag(true);
    }else {
        globalPlay.setFgMadeFlag(false);
    }
    flow = true;
    newPlayDialog();
    dialog.dismiss();
}