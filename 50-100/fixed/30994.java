public void run() {
    while (isPlaying) {
        try {
            if ((jcPlayerServiceListener) != null)
                jcPlayerServiceListener.onTimeChanged(mediaPlayer.getCurrentPosition());
            
            if ((notificationListener) != null)
                notificationListener.onTimeChanged(mediaPlayer.getCurrentPosition());
            
            java.lang.Thread.sleep(1000);
        } catch (java.lang.IllegalStateException | java.lang.InterruptedException | java.lang.NullPointerException e) {
            e.printStackTrace();
        }
    } 
}