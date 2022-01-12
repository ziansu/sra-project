@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked)
        command = ((byte) (128));
    else
        command = 0;
    
    skbarLeft.setProgress(0);
    skbarRight.setProgress(0);
    sendCommand();
}