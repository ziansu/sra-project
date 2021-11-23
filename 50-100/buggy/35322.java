private boolean isReportTime() throws com.ch4process.utils.CH4P_Exception {
    try {
        java.util.Calendar now = java.util.Calendar.getInstance();
        if (now.after(reportTime)) {
            com.ch4process.utils.CH4P_Functions.Log(this.getClass().getName(), CH4P_Functions.LOG_inConsole, 100, "VigieReport : isReportTime = true.");
            return true;
        }
        return false;
    } catch (java.lang.Exception ex) {
        throw new com.ch4process.utils.CH4P_Exception(("-VigieReport isReportTime error-" + (ex.getMessage())), ex.getCause());
    }
}