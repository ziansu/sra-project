public static void start() {
    if (!(org.voltdb.TraceTool.starts)) {
        java.lang.System.out.println("Monitor is started");
        org.voltdb.TraceTool.starts = true;
    }
}