public static void startTimer(long millisec, java.lang.String message, long chatId) throws java.io.IOException, java.lang.SecurityException {
    it.stanzino.memobot.functions.Util.c = java.util.Calendar.getInstance();
    millisec = (millisec * 1000) + (it.stanzino.memobot.functions.Util.c.getTimeInMillis());
    it.stanzino.memobot.functions.Util.writer = new it.stanzino.memobot.in_out.FileOverWriter(it.stanzino.memobot.httpServer.MainServer.TIMES_PATH);
    it.stanzino.memobot.functions.Util.writer.write((((((millisec + ",") + message) + ",") + chatId) + "\n"));
    return ;
}