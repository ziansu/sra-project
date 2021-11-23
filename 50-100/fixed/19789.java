public static org.newdawn.slick.openal.Audio QuickLoadAudio(java.lang.String name) {
    org.newdawn.slick.openal.Audio aud = null;
    try {
        aud = org.newdawn.slick.openal.AudioLoader.getAudio("WAV", org.newdawn.slick.util.ResourceLoader.getResourceAsStream((("com/Jakibah/Carbon/Res/sounds/" + name) + ".wav")));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return aud;
}