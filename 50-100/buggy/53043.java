private void showFalseLiteralsActionPerformed(java.awt.event.ActionEvent evt) {
    switch (getState()) {
        case EDITION :
            break;
        case EDITION_ERROR :
            break;
        case NO_RESULT :
            break;
        case SINGLE_RESULT :
            break;
        case FIRST_RESULT :
        case MIDDLE_RESULT :
        case LAST_RESULT :
            this.setResult();
            break;
        default :
            java.lang.System.out.println(("Undefined action set for the state : " + (getState())));
    }
    this.updateUI();
}