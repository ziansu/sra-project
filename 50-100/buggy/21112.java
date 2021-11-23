public void buttonClicked(int buttonID) {
    switch (buttonID) {
        case 0 :
            activityController.createActivity(buttonID, activityNameField.getText(), ageLimitField.getText(), heightLimitField.getText());
            break;
        case 1 :
            break;
        case 2 :
            break;
        default :
            break;
    }
}