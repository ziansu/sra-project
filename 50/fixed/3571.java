@java.lang.Override
public int compareTo(tars.model.task.DateTime o) {
    if (((o.endDate) == null) || ((this.endDate) == null)) {
        return tars.model.task.DateTime.DATETIME_COMPARE_NULL;
    }else {
        return this.endDate.compareTo(o.endDate);
    }
}