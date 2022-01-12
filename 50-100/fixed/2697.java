private void checkAnswer(char answer) {
    if ((countryPanel.getCurrentQuestion().getAnswer()) == answer) {
        (levelsRemaining)--;
        alreadyBeen.add(currentCountry);
        showMapPanel();
    }else
        countryPanel.removeWrongAnswer(answer);
    
}