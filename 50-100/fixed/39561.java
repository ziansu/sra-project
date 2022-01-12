private void init() {
    Gdx.app.log(miceta.game.core.controllers.CvWorldController.TAG, "init in the cv blocks manager");
    timePassed = 0;
    randomNumber = getNewNumber();
    AudioManager.instance.setStage(stage);
    AudioManager.instance.readFeedback(randomNumber);
    timeToWait = (randomNumber) + (miceta.game.core.util.Constants.WAIT_AFTER_KNOCK);
    lastAnswerRight = false;
}