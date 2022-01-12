public void run() {
    while (true) {
        delay = (waveManager.delay) * 2;
        sendControlMessage();
        try {
            java.util.concurrent.TimeUnit.MILLISECONDS.sleep(delay);
        } catch (java.lang.Exception e) {
        }
        int count = 0;
        while (count < 5) {
            sendServiceMessage();
            delay = waveManager.delay;
            try {
                java.util.concurrent.TimeUnit.MILLISECONDS.sleep(delay);
            } catch (java.lang.Exception e) {
            }
            count++;
        } 
    } 
}