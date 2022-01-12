private void turnCameraOn() {
    webcam = com.github.sarxos.webcam.Webcam.getDefault();
    webcam.setViewSize(WebcamResolution.VGA.getSize());
    webcam.open();
    panel = new com.github.sarxos.webcam.WebcamPanel(webcam);
    panel.setMirrored(true);
    panel.setBounds(400, 50, 305, 229);
    frame.getContentPane().add(panel);
}