@java.lang.Override
public void onClick(android.view.View view) {
    if ((negativeListener) != null) {
        negativeListener.onClick(this, DialogInterface.BUTTON_NEGATIVE);
    }
    dismiss();
}