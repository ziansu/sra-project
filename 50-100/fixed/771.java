private java.lang.String getDateandTimeasYYMMDDhhmm() {
    java.lang.String methodname = new java.lang.Object() {    }.getClass().getEnclosingMethod().getName();
    mjt.shopwise.LogMsg.LogMsg(LogMsg.LOGTYPE_INFORMATIONAL, mjt.shopwise.BackupActivity.LOGTAG, "Invoked", this, methodname);
    java.util.Calendar cldr = java.util.Calendar.getInstance();
    @android.annotation.SuppressLint(value = "SimpleDateFormat")
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyyMMddHHmm");
    return "_" + (sdf.format(cldr.getTime()));
}