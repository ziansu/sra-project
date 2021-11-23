public void run() {
    com.example.heregpsloc.SessionIdentifierGenerator sig = new com.example.heregpsloc.SessionIdentifierGenerator();
    track_id = sig.nextSessionId();
    service_running = true;
    while (service_running) {
        android.location.Location loc = getGPS();
        write2db(loc);
        try {
            java.lang.Thread.sleep(millisec_wait);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}