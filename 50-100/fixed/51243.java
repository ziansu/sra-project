private void filterTimeRollUp(com.mediamath.terminalone.ReportCriteria report, java.lang.StringBuilder path) {
    if (((report.getTime_rollup()) != null) && (!(report.getTime_rollup().isEmpty()))) {
        uriAppender(path);
        path.append(("time_rollup=" + (report.getTime_rollup())));
    }
}