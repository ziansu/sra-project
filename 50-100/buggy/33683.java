public static synchronized void setBackgroundMusic(java.lang.String name) {
    if ((com.bladeannihilation.main.Audio.bgThread) != null) {
        com.bladeannihilation.main.Audio.bgThread.interrupt();
    }
    if (((com.bladeannihilation.main.Audio.ba) != null) || (com.bladeannihilation.main.Audio.isBackgroundRunning)) {
        com.bladeannihilation.main.Audio.ba.endRun();
    }
    com.bladeannihilation.main.Audio.bgThread = null;
    com.bladeannihilation.main.Audio.ba = null;
    java.lang.System.gc();
    com.bladeannihilation.main.Audio.isBackgroundRunning = true;
    com.bladeannihilation.main.Audio.ba = new com.bladeannihilation.main.BackgroundAudio(name);
    com.bladeannihilation.main.Audio.bgThread = new java.lang.Thread(com.bladeannihilation.main.Audio.ba);
    com.bladeannihilation.main.Audio.bgThread.start();
}