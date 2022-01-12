public void setEndDate(java.time.LocalDate end_date2) {
    if (end_date2 == null) {
        end_date_string = "";
    }else {
        end_date_string = end_date2.format(seedu.ticktask.model.task.DueDate.DATE_FORMAT).toString();
        end_date = end_date2;
        if ((end_date) != null) {
            value = ((getStartDate()) + " - ") + (getEndDate());
        }else {
            value = getStartDate();
        }
    }
}