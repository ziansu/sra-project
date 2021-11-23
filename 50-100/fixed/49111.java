@java.lang.Override
public void handle(sun.misc.Signal signal) {
    (sigIntCount)++;
    if ((sigIntCount) == 5) {
        sun.misc.Signal.raise(new sun.misc.Signal("INT"));
        java.lang.Runtime.getRuntime().halt(0);
    }else
        if ((client.isRunning()) && ((client.isSuspended()) == false)) {
            client.askForStop();
            exiting = true;
        }else {
            client.stop();
            this.stop();
        }
    
}