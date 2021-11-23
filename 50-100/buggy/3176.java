public void setStartDate(java.time.LocalDate start_date2) {
    if (start_date2 == null) {
        start_date_string = "";
    }else {
        start_date_string = start_date2.format(seedu.ticktask.model.task.DueDate.DATE_FORMAT).toString();
        start_date = start_date2;
        if ((end_date) != null) {
            value = ((getStartDate()) + " - ") + (getEndDate());
        }else {
            value = getStartDate();
        }
    }
}