static void stop() {
    sGui.stopThread();
    com.ds2016.Main.Main.stopThread();
    java.lang.System.out.println(((("stop(): sTotalThroughput: " + (sTotalThroughput)) + " sTotalSuccess: ") + (sTotalSuccess)));
}