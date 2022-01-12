public void run() {
    while (!(isDisposed)) {
        if (((queue.size()) == 0) || (isPlaying)) {
            try {
                java.lang.Thread.sleep(200);
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            mediaPlayer = new javafx.scene.media.MediaPlayer(queue.poll());
            mediaPlayer.play();
            isPlaying = true;
            mediaPlayer.setOnEndOfMedia(() -> {
                isPlaying = false;
            });
        }
    } 
}