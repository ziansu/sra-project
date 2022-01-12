public void previousYearButtonHandler(javafx.event.ActionEvent ae) {
    --(currentChosenYearNumber);
    calendarYearLabel.setText(java.lang.String.valueOf(currentChosenYearNumber));
    calendarGrid.fillCalendarWith(currentChosenMonthNumber, currentChosenYearNumber);
}