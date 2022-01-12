@java.lang.Override
public void onClick(android.view.View v) {
    alertDialog.dismiss();
    if ((com.kongzue.dialog.SelectDialog.positiveClick) != null)
        com.kongzue.dialog.SelectDialog.positiveClick.onClick(v);
    
}