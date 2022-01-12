private void printCallback() {
    TableGrader.GradingWeight gradingWeight = new TableGrader.GradingWeight();
    gradingWeight.freeDays = freeDaysCheckBox.isSelected();
    gradingWeight.startHour = startHourCheckBox.isSelected();
    gradingWeight.windows = windowsCheckBox.isSelected();
    timeTable.gradeTables(gradingWeight);
    showTimeTable.showTimeTables(contentPane, timeTable.getTables());
}