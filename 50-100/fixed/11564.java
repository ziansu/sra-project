public void itemStateChanged(java.awt.event.ItemEvent ie) {
    switch (ie.getStateChange()) {
        case 1 :
            emailInputField.setEnabled(true);
            useEmail = true;
            break;
        case 2 :
            emailInputField.setEnabled(false);
            useEmail = false;
            break;
        default :
            break;
    }
}