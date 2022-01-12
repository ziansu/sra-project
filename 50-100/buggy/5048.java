private org.newdawn.slick.Image[] createFallFrames() {
    org.newdawn.slick.Image[] frames = new org.newdawn.slick.Image[16];
    try {
        for (int i = 0; i < (frames.length); i++) {
            frames[i] = new org.newdawn.slick.Image((("pics/robot/fall " + i) + ".png"));
        }
    } catch (org.newdawn.slick.SlickException e) {
        e.printStackTrace();
    }
    return frames;
}