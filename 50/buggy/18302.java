@java.lang.Override
public void stop() throws java.lang.Exception {
    try {
        mainThread.join();
        com.bartershock.bot.controller.Application.stop();
    } catch (java.lang.InterruptedException interruptedException) {
        java.lang.System.err.println(interruptedException.getMessage());
        throw interruptedException;
    }
}