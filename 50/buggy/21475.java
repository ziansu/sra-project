public static java.lang.String getDownloadsDirectory() {
    java.lang.String dd = org.oscarehr.hospitalReportManager.SFTPConnector.downloadsDirectory;
    if ((dd.equals("")) || (dd.equals(null))) {
        dd = "webapps/OscarDocument/hrm/sftp_downloads/";
        return dd;
    }else {
        return org.oscarehr.hospitalReportManager.SFTPConnector.downloadsDirectory;
    }
}