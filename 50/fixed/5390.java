public static void playBG(long mili) {
    util.AudioUtility.soundTrackBG.setMicrosecondPosition((mili * 1000));
    util.AudioUtility.soundTrackBG.loop(javax.sound.sampled.Clip.LOOP_CONTINUOUSLY);
}