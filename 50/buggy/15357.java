public void run() {
    do {
        try {
            player.play();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        if (loop)
            load(fileName);
        
    } while (loop );
    playing = false;
}