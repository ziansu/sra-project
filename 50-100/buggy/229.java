public void getCurrentContours() {
    org.usfirst.frc4579.Robot2017.subsystems.Mat still = new org.usfirst.frc4579.Robot2017.subsystems.Mat();
    java.util.ArrayList<org.usfirst.frc4579.Robot2017.subsystems.MatOfPoint> countourList = new java.util.ArrayList<>();
    cvSink.grabFrame(still);
    contourList = myGripPipeline.filterContoursOutput();
    org.opencv.imgproc.Imgproc.drawContours(still, contourList, 1, new org.usfirst.frc4579.Robot2017.subsystems.Scalar(0, 0, 0));
}