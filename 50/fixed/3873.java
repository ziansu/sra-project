@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if ((mChoice) >= 0) {
        process(mChoice);
    }
    dialog.dismiss();
}