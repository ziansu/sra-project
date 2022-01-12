@java.lang.Override
public void stop() throws java.lang.Exception {
    try {
        com.bartershock.bot.controller.Application.stop();
        mainThread.join();
    } catch (java.lang.InterruptedException interruptedException) {
        java.lang.System.err.println(interruptedException.getMessage());
        throw interruptedException;
    }
}