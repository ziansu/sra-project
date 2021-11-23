@java.lang.Override
public void run() {
    try {
        downloadDelayedTrains(trainName, url);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e);
        errorWriter.writeError(e.toString());
    }
}