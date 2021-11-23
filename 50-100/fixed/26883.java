public void handleEmployeeChoiceBox() {
    java.lang.System.out.println("employee box clicked");
    errorLabel.setText("");
    if (confirm.isVisible())
        confirm.setVisible(false);
    
    if (timeBox.isVisible()) {
        timeBox.setVisible(false);
    }
    if ((dayBox.isVisible()) == false)
        dayBox.setVisible(true);
    
    setDayChoiceBox();
}