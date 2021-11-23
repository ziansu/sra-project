@java.lang.Override
public void run() {
    while (((scannerInput) != null) && (!(scannerInput.hasFocus())))
        scannerInput.requestFocus();
    
}