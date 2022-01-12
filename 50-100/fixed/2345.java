public boolean StartServer() {
    cmd.printl((("\t" + (lang.ServerReady)) + "\n"));
    send.start();
    animator.start();
    do {
        exitConnection = receiveAnswer();
        cmd.sleep(1000);
    } while ((exitConnection) != null );
    send.interrupt();
    animator.interrupt();
    exitConnection = null;
    return false;
}