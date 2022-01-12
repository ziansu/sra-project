public void updateSobrietyLevel(int num) {
    sobrietyLevel += num;
    if (gameOver()) {
        sobrietyMeter.setText("Sobriety Level: 0%");
        gameOver();
    }else
        if ((sobrietyLevel) >= 100) {
            sobrietyMeter.setText("Sobriety Level: 100%");
        }else {
            sobrietyMeter.setText((("Sobriety Level: " + (sobrietyLevel)) + "%"));
            frame.repaint();
        }
    
}