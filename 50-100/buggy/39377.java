public static void sleep(long ms, java.lang.String cause) {
    try {
        java.lang.String message = ("Need to sleep " + ms) + "ms";
        if (!(org.apache.commons.lang3.StringUtils.isEmpty(cause))) {
            message = ", cause: " + cause;
        }
        daaa.qdscraper.services.Console.println(message);
        java.lang.Thread.sleep(ms);
    } catch (java.lang.InterruptedException e) {
        daaa.qdscraper.services.Console.printErr(e);
    }
}