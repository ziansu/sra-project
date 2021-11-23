@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which, boolean isChecked) {
    if (isChecked)
        selected[which] = false;
    else
        selected[which] = true;
    
}