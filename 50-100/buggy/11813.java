public void run() {
    while (!(isDisposed)) {
        while (((queue.size()) == 0) || (isPlaying)) {
            try {
                java.lang.Thread.sleep(200);
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        } 
        mediaPlayer = new javafx.scene.media.MediaPlayer(queue.poll());
        mediaPlayer.play();
        isPlaying = true;
        mediaPlayer.setOnEndOfMedia(() -> {
            isPlaying = false;
        });
    } 
}