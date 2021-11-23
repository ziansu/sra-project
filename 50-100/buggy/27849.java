public java.util.Date getCurrentTime() {
    currentDate = new java.util.Date();
    java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("hh:mm:ss");
    java.util.Date currentTimeDate = null;
    try {
        currentTimeDate = dateFormat.parse(dateFormat.format(currentDate));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return currentTimeDate;
}