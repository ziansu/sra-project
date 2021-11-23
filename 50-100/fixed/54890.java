public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String speed = speedField.getText().trim();
    try {
        int sp = java.lang.Integer.parseInt(speed);
        if (sp <= 0)
            return ;
        
        model.timeSpeed = sp;
        updateTimeTimer.setDelay((1000 / sp));
    } catch (java.lang.NumberFormatException exept) {
    }
}