private void filterTimeRollUp(com.mediamath.terminalone.ReportCriteria report, java.lang.StringBuffer path) {
    if (((report.getTime_rollup()) != null) && (!(report.getTime_rollup().isEmpty()))) {
        uriAppender(path);
        path.append(("time_rollup=" + (report.getTime_rollup())));
    }
}