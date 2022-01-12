public void buttonClicked(int buttonID) {
    switch (buttonID) {
        case 0 :
            activityController.createActivity(buttonID, activityNameField.getText().trim(), ageLimitField.getText().trim(), heightLimitField.getText().trim());
            break;
        case 1 :
            break;
        case 2 :
            break;
        default :
            break;
    }
}