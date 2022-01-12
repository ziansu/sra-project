public static boolean isMusicPlaying(java.lang.String name) {
    return com.global.AudioManager.musicMap.containsKey(name) ? com.global.AudioManager.musicMap.get(name).isPlaying() : false;
}