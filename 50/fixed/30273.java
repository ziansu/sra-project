@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if ((mOnDialogClickListener) != null) {
        mOnDialogClickListener.onClick();
    }
}