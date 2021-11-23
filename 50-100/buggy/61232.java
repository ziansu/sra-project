public java.lang.Integer execute(hu.unideb.worktime.api.model.worklog.SaveWorklogRequest key) {
    java.lang.Integer result = null;
    java.util.List<java.lang.Integer> spResult = ((java.util.List<java.lang.Integer>) (super.execute(key.getBegin(), key.getWorkHour(), key.getWorkerId(), 1).get(hu.unideb.worktime.jdbc.worklog.SpSaveWorklog.SP_RESULT)));
    if (spResult != null) {
        result = spResult.get(0);
    }
    return result;
}