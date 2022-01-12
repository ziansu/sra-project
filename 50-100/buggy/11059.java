public void setEndTime(java.time.LocalTime end_time2) {
    if (end_time2 == null) {
        java.time.LocalTime localtime = java.time.LocalTime.MAX;
        end_time_string = "";
    }else {
        end_time_string = end_time2.format(seedu.ticktask.model.task.DueTime.TIME_FORMAT).toString();
        end_time = end_time2;
        if ((end_time) != null) {
            value = ((getStartTime()) + " - ") + (getEndTime());
        }else {
            value = getStartTime();
        }
    }
}