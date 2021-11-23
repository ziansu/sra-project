private void animateSprites() {
    while (true) {
        for (spriteInterface.Sprite sprite : spriteList) {
            move(sprite);
        }
        try {
            java.lang.Thread.sleep(60);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}