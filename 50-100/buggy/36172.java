@java.lang.Override
public void run() {
    input.getInputEditText().setEnabled(status);
    if (status && ((input.getInputEditText().getText().length()) > 0))
        input.getButton().setEnabled(true);
    else
        if (!status)
            input.getButton().setEnabled(false);
        
    
}