public void displaySchedule(comp110.Schedule schedule) {
    _scheduleStage = new javafx.stage.Stage();
    renderScheduleStage(_controller.getSchedule());
    _scheduleStage.show();
}