public static void init() {
    try {
        GameMain.AudioPlayer.musicMap.put("music", new org.newdawn.slick.Music("res/music.ogg"));
    } catch (org.newdawn.slick.SlickException e) {
        e.printStackTrace();
    }
}