public void startCamera() {
    com.ni.vision.NIVision.IMAQdxStartAcquisition(session);
    com.ni.vision.NIVision.Rect rect = new com.ni.vision.NIVision.Rect(10, 10, 100, 100);
    com.ni.vision.NIVision.IMAQdxGrab(session, frame, 1);
    edu.wpi.first.wpilibj.CameraServer.getInstance().setImage(frame);
    edu.wpi.first.wpilibj.Timer.delay(0.005);
}