public void run() {
    try {
        java.lang.Thread.sleep(100);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e);
    }
    while (!(this.stopped)) {
        java.lang.System.out.print("--> ");
        java.lang.String message = java.lang.System.console().readLine();
        this.send(message);
        this.send("/EndListening");
        if (message.equals("Exit")) {
            this.stopped = true;
            break;
        }
    } 
}