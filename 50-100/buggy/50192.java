public synchronized void receiveMusic() {
    while (playingMusic) {
        try {
            byte[] b = null;
            while (playingMusic) {
                b = receiveThruUDP();
                toSpeaker(b);
            } 
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    } 
}