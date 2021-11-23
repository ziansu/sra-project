@java.lang.Override
public void loop() {
    try {
        java.lang.System.out.println(track);
        sendFile(((track) == null ? silence : track));
        if ((track) != null) {
            track = null;
            tFetch.stopAndWait();
            new java.lang.Thread(tFetch).start();
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}