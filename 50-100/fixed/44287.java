@java.lang.Override
public void run() {
    try {
        java.lang.String message;
        while ((message = in.readLine()) != null) {
            messages.put(message);
        } 
    } catch (java.io.IOException | java.lang.InterruptedException ex) {
        java.lang.System.out.println(("CTC Error:" + (ex.getMessage())));
    }
}