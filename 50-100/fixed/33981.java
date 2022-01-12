public void run() {
    try {
        java.text.DateFormat dateFormat = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        java.util.Date date = new java.util.Date();
        java.lang.String finalMsg = ((dateFormat.format(date)) + ": ") + (msg);
        logger.LoggerThread.log(finalMsg);
    } catch (java.io.IOException ioe) {
        java.lang.System.out.println(("IO Exception in logger thread: " + (ioe.getMessage())));
    }
}