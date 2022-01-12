public void RED() {
    if ((Phase) == 'F') {
        isReadyForRED();
    }else {
        if ((Phase) == 'G') {
            UserInput.setClass(ActualGREENCode);
        }
        switchRED();
        Fenster.setText(UserInput.getTestCode());
        UserInput.setTest(Fenster.getText());
        if ((UserInput) != null) {
            Fenster.setText(UserInput.getTestCode());
            UserInput.setTest(Fenster.getText());
        }
    }
}