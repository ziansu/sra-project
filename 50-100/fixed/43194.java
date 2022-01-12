@java.lang.Override
public synchronized void talk(java.lang.String message) {
    try {
        while ((o) == null) {
            java.lang.System.out.println("My partner is not online at this moment, waiting 1000ms");
            wait(1000);
            if (s.isClosed()) {
                getConnection(port);
            }
        } 
        o.writeUTF(message);
        o.flush();
    } catch (java.io.IOException e) {
        updateArea(((("FAILURE: UNABLE TO DELIVER THE MESSAGE: " + message) + " to ") + (partner)));
    } catch (java.lang.InterruptedException e) {
    }
}