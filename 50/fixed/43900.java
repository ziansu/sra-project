@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which, boolean isChecked) {
    if (isChecked)
        selected[which] = true;
    else
        selected[which] = false;
    
}