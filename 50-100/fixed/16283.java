public void stop(int milliFadeTimeout) {
    float volumeDecrement = (volume) / milliFadeTimeout;
    new java.lang.Thread(() -> {
        while ((volume) > 0.0F) {
            setVolume(((volume) - volumeDecrement));
            try {
                java.lang.Thread.sleep(1);
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        } 
        alSourceStop(srcNames);
    }).start();
}