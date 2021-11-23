public void actionPerformed(java.awt.event.ActionEvent evt) {
    new java.lang.Thread(() -> {
        try {
            duplex.recognize(mic.getTargetDataLine(), mic.getAudioFormat());
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
        }
    }).start();
    record.setEnabled(false);
    stop.setEnabled(true);
}