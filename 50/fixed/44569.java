@java.lang.Override
public void run() {
    try {
        this.autoStart();
    } catch (java.lang.InterruptedException | java.io.IOException e) {
        com.kaavie.chrmaticSoulRobot.SimpleRobot.logger.debug(("SimpleRobot throw exception ,the Exception is " + (e.getMessage())));
    }
}