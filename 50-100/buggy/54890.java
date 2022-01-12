public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String speed = speedField.getText();
    try {
        java.lang.Integer.parseInt(speed);
    } catch (java.lang.NumberFormatException exept) {
        return ;
    }
    int sp = java.lang.Integer.parseInt(speed);
    model.timeSpeed = sp;
    updateTimeTimer.setDelay((1000 / sp));
}