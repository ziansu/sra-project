@java.lang.Override
public void loop() {
    try {
        java.lang.System.out.println(track);
        if ((track) != null) {
            sendFile(track);
            track = null;
            tFetch.stopAndWait();
            new java.lang.Thread(tFetch).start();
        }else {
            sendFile(silence);
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}