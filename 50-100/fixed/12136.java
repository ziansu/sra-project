@java.lang.Override
public void run() {
    boolean end = false;
    while (!end) {
        if ((elements.size()) > 0) {
            de.uni_hildesheim.sse.monitoring.runtime.recordingServer.RecordingStrategiesElement element = elements.remove(0);
            element.process(strategy);
            int id = element.getIdentification();
            element.release();
            end = (Constants.ENDSYSTEM) == id;
        }else {
            java.lang.Thread.yield();
        }
    } 
    printElementStatistics();
}