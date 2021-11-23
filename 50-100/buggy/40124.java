public void setEndDate(java.time.LocalDate end_date2) {
    if (end_date2 == null) {
        end_date_string = "";
    }else {
        end_date_string = end_date2.format(seedu.ticktask.model.task.DueDate.DATE_FORMAT).toString();
        value = ((getStartDate()) + " - ") + (getEndDate());
        end_date = end_date2;
    }
}