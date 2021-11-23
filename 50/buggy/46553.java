private java.lang.String createFileName() {
    java.util.Date date = new java.util.Date();
    java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("ddMMyyyy-HHmm");
    java.lang.String now = format.format(date);
    java.lang.String exportFileCSV = ("export_interviews_" + now) + ".csv";
    return exportFileCSV;
}