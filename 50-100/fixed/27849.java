public long getCurrentTime() {
    currentDate = new java.util.Date();
    java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("hh:mm:ss");
    long currentTimeDate = -1;
    try {
        currentTimeDate = dateFormat.parse(dateFormat.format(currentDate)).getTime();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return currentTimeDate;
}