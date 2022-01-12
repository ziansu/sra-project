public void handle(javafx.event.ActionEvent arg0) {
    if (!(nl.tudelft.scrumbledore.userinterface.GameDisplay.currentTimer.isPaused())) {
        passedButton.setText(Constants.GAME_STARTBUTTON);
        nl.tudelft.scrumbledore.userinterface.GameDisplay.currentTimer.pause();
    }else {
        passedButton.setText(Constants.GAME_STOPBUTTON);
        nl.tudelft.scrumbledore.userinterface.GameDisplay.currentTimer.resume();
    }
}