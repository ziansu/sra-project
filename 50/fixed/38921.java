@java.lang.Override
public void avariceFinished() {
    java.lang.System.out.println("Avarice finished");
    synchronized(this) {
        status = "READY";
    }
    currentClientKey = null;
    avarice = null;
}