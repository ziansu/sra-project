@java.lang.Override
public void onClick(android.view.View v) {
    if (goodCB.isChecked()) {
        globalPlay.setFgMadeFlag(true);
    }else {
        globalPlay.setFgMadeFlag(false);
    }
    flow = false;
    newPlayDialog();
    dialog.dismiss();
}