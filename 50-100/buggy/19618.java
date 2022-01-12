@java.lang.Override
public void update() {
    if ((this.timeInSeconds) == 0) {
        this.referee.speak("src/music/endGame.wav");
        this.referee.stopTimer();
    }
    if ((this.timeInSeconds) == 60) {
        this.referee.speak("src/music/Toy_Train_Whistle.wav");
    }
    (this.timeInSeconds)--;
}