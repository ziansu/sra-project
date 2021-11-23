public void runClientLoop() {
    java.lang.System.out.println("runclientloop");
    clientLoop = new xyz.guyaaltonen.pickleirc.ClientLoop(this);
    clientLoop.start();
}