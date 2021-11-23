private void detectLoop() {
    while (true) {
        try {
            detectFaceAndPlayMusic();
        } catch (final java.lang.Exception e) {
            e.printStackTrace();
            sleep();
        }
    } 
}