public static void init() {
    try {
        GameMain.AudioPlayer.soundMap.put("menu_sound", new org.newdawn.slick.Sound("res/click_sound.ogg"));
        GameMain.AudioPlayer.musicMap.put("music", new org.newdawn.slick.Music("res/music.ogg"));
    } catch (org.newdawn.slick.SlickException e) {
        e.printStackTrace();
    }
}