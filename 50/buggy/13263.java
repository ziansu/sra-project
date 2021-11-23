public static void startRecording() {
    com.github.brockstar17.AudioRunner.setFormat(new javax.sound.sampled.AudioFormat(192000, 16, 2, true, false));
    com.github.brockstar17.AudioRunner.changeThread(true);
    new java.lang.Thread(new com.github.brockstar17.AudioRunner()).start();
}