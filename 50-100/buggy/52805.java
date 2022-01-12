public void run() {
    try {
        if (!(isPaused())) {
            player.play();
        }
        if (player.isComplete()) {
            java.lang.System.out.println(("COMPLETE: " + (top.getSong(getUUID()).getPath())));
            if ((top) != null) {
                top.notifyDone(uuid);
            }else {
                java.lang.System.out.println("THINGY IS NULL");
            }
            return ;
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}