@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (which >= 0) {
        selectedEntry = which;
        super.onClick(dialog, DialogInterface.BUTTON_POSITIVE);
    }else
        super.onClick(dialog, which);
    
    dialog.dismiss();
}