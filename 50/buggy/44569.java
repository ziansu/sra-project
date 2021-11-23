@java.lang.Override
public void run() {
    java.lang.System.out.println("sadfsf");
    try {
        this.autoStart();
    } catch (java.lang.InterruptedException e) {
        com.kaavie.chrmaticSoulRobot.SimpleRobot.logger.debug(("SimpleRobot throw exception ,the Exception is " + (e.getMessage())));
    }
}