@java.lang.Override
public void run() {
    while (true) {
        try {
            java.lang.String message = messages.take();
            observableMessage.set(message);
        } catch (java.lang.InterruptedException e) {
            java.lang.System.out.println(("InterruptedException: " + (e.getMessage())));
        }
    } 
}