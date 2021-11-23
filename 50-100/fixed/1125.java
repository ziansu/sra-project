@java.lang.Override
public void run() {
    running = true;
    while (running) {
        try {
            netzwerk.messages.Message message = ((netzwerk.messages.Message) (in.readObject()));
            if ((listener) != null)
                listener.messageReceived(message);
            
        } catch (java.io.IOException | java.lang.ClassNotFoundException ex) {
            java.lang.System.out.println("SmartInputStream : closed input stream");
            java.lang.System.err.println(ex);
            if (((closeListener) != null) && (running))
                closeListener.run();
            
            running = false;
        }
    } 
}