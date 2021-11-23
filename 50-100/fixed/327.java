public boolean setFile(java.lang.String file) {
    try {
        audio.open(file);
        return true;
    } catch (javax.sound.sampled.UnsupportedAudioFileException | java.io.IOException | javax.sound.sampled.LineUnavailableException ex) {
        javax.swing.JOptionPane.showMessageDialog(((javax.swing.JFrame) (null)), ("\u062d\u062f\u062b \u0627\u0644\u062e\u0637\u0623 \u0627\u0644\u062a\u0627\u0644\u064a : \n" + (ex.getLocalizedMessage())), "خطأ", javax.swing.JOptionPane.ERROR_MESSAGE);
        return false;
    }
}