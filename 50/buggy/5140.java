private mil.nga.dice.report.Report getReportWithPath(java.io.File path) {
    for (mil.nga.dice.report.Report r : reports) {
        if (r.getPath().equals(path)) {
            return r;
        }
    }
    return null;
}