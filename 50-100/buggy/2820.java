@java.lang.Override
public void onClick(android.view.View v) {
    int prevDateIndex = (scheduledDates.indexOf(dateText.getText())) - 1;
    if (prevDateIndex >= 0) {
        java.lang.String date = scheduledDates.get(scheduledDates.indexOf(dateText.getText()));
        refreshDateEvents(date);
    }
}