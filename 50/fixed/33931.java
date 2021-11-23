@java.lang.Override
public void run() {
    synchronized(captureStatus) {
        captureStatus = false;
        sensor.ZoomLevel zoom_level = sensor.ZoomLevel.fromValue(zoom);
        java.lang.System.out.println(("Taking new picture at zoom level: " + zoom_level));
        image = generateImage(elapsed_seconds, zoom_level);
        captureStatus = true;
    }
}