public void setStart() throws java.io.IOException {
    programdata.Exercise.start();
    if (KatalogCreator.choosenKatalog.timetracking) {
        scenes.Controller.startDate = java.time.LocalDateTime.now();
        programdata.Tracker.startTrack();
    }
    resetTimer();
    start.setDisable(true);
    picture.setDisable(false);
    nextStep.setDisable(false);
    analyseButton.setDisable(false);
    scenes.Controller.codeProperty.setValue(Exercise.exerciseCode.asString());
    scenes.Controller.testProperty.setValue(Exercise.exerciseTest.asString());
    codeName = programdata.Exercise.codeName;
    testName = programdata.Exercise.testName;
}