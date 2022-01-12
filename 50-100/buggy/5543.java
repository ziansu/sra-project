public void handleDayChoiceBox() {
    java.lang.System.out.println("day box clicked");
    errorLabel.setText("");
    if (confirm.isVisible())
        confirm.setVisible(false);
    
    if ((timeBox.isVisible()) == false)
        timeBox.setVisible(true);
    
    setTimeChoiceBox();
}