@java.lang.Override
public void run() {
    try {
        java.lang.Object last = null;
        while ((last == null) || (!(last.equals("END")))) {
            last = nextEvent();
            instantiateService().printNames();
        } 
    } catch (final java.lang.Throwable cause) {
        cause.printStackTrace();
    }
}