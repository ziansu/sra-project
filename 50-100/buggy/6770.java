@java.lang.Override
public void run() {
    try {
        if (clipCheck)
            com.bsc.cs.kidssoftware.Test.clip.stop();
        
        com.bsc.cs.kidssoftware.Test.clip = javax.sound.sampled.AudioSystem.getClip();
        javax.sound.sampled.AudioInputStream inputStream = javax.sound.sampled.AudioSystem.getAudioInputStream(com.bsc.cs.kidssoftware.Test.class.getResource(("/assets/" + (file2.getName()))));
        com.bsc.cs.kidssoftware.Test.clip.open(inputStream);
        com.bsc.cs.kidssoftware.Test.clip.start();
        clipCheck = true;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}