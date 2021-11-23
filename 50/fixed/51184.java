@java.lang.Override
public void enable() throws java.io.IOException {
    if (!(sensorEnabled)) {
        sensorEnabled = true;
        new eu.musesproject.windowsclient.contextmonitoring.sensors.DirectoryWatcherSensor.EventObserver().backgroundProcess.start();
    }
}