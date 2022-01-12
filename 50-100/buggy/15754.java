public void actionPerformed(java.awt.event.ActionEvent evt) {
    try {
        duplex.recognize(mic.getTargetDataLine(), mic.getAudioFormat());
        record.setEnabled(false);
        stop.setEnabled(true);
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
}