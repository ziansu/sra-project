@java.lang.Override
public void run() {
    try {
        java.lang.String message = in.readLine();
        while (message != null) {
            messages.put(message);
            message = in.readLine();
        } 
    } catch (java.io.IOException | java.lang.InterruptedException ex) {
        java.lang.System.out.println(("CTC Error:" + (ex.getMessage())));
    }
}