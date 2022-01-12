public void onAddStepsButtonPress() {
    if (isAddStepsValid(addSteps.getText())) {
        addDailySteps(addSteps.getText());
        addLeftSteps(dailySteps.getText());
    }
}