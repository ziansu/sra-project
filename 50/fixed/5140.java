private mil.nga.dice.report.Report getReportWithPath(java.io.File path) {
    for (mil.nga.dice.report.Report r : reports) {
        if (path.equals(r.getPath())) {
            return r;
        }
    }
    return null;
}