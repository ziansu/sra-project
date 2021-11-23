public static boolean isMusicPlaying(java.lang.String name) {
    if (com.global.AudioManager.musicMap.containsKey(name)) {
        return com.global.AudioManager.musicMap.get(name).isPlaying();
    }
    return false;
}