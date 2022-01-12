@java.lang.Override
public void onClick(android.view.View v) {
    if (goodCB.isChecked()) {
        globalPlay.setFgMadeFlag(true);
    }else {
        globalPlay.setFgMadeFlag(false);
    }
    saved = true;
    dialog.dismiss();
    savePlay();
}