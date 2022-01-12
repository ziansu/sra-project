public java.lang.String defaultReportPath() {
    java.io.File report = new java.io.File(((java.lang.System.getProperty("user.home")) + "/report"));
    try {
        if (!(report.exists())) {
            report.mkdir();
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return report.getPath();
}