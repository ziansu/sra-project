public void updateSobrietyLevel(int num) {
    sobrietyLevel += num;
    if ((sobrietyLevel) <= 0) {
        sobrietyMeter.setText("Sobriety Level: 0%");
        gameOver();
    }else
        if ((sobrietyLevel) >= 100) {
            sobrietyMeter.setText("Sobriety Level: 100%");
        }else {
            sobrietyMeter.setText((("Sobriety Level: " + (sobrietyLevel)) + "%"));
            updateStoryText("This is a test of the emergency broadcast system");
            frame.repaint();
        }
    
}