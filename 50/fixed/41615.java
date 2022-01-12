@java.lang.Override
public void onClick(android.view.View v) {
    if (callBack != null) {
        dialog.dismiss();
        callBack.onReplay();
    }
}