@java.lang.SuppressWarnings(value = "SleepWhileInLoop")
public static java.lang.String queueReadLine() {
    while (true) {
        try {
            java.lang.String msg = com.gmt2001.Console.in.inputQueue.poll();
            if (msg != null) {
                out.println(" -> ");
                return msg;
            }
            java.lang.Thread.sleep(100);
        } catch (java.lang.Exception e) {
            com.gmt2001.Console.com.gmt2001.Console.err.logStackTrace(e);
            return "";
        }
    } 
}