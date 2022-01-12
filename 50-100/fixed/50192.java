public void receiveMusic() {
    while (playingMusic) {
        try {
            byte[] b = null;
            while (playingMusic) {
                b = receiveThruUDP();
                java.lang.System.out.println(b);
                toSpeaker(b);
            } 
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    } 
}