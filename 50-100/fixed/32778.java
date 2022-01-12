public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    try {
        if ((fileName) != null) {
            javax.sound.sampled.Clip clip = javax.sound.sampled.AudioSystem.getClip();
            clip.open(javax.sound.sampled.AudioSystem.getAudioInputStream(new java.io.File(fileName)));
            clip.start();
        }
    } catch (java.lang.Exception e1) {
        java.lang.System.err.println(e1);
        e1.printStackTrace();
    }
}