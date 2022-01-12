private void checkAnswer(char answer) {
    if ((countryPanel.getCurrentQuestion().getAnswer()) == answer) {
        (levelsRemaining)--;
        alreadyBeen.add(currentCountry);
        if ((levelsRemaining) > 0)
            showMapPanel();
        else
            javax.swing.JOptionPane.showMessageDialog(null, "You Win");
        
    }else
        countryPanel.removeWrongAnswer(answer);
    
}