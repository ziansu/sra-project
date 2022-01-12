public Application.MatOfFloat getDescVals() {
    HD.getDetectedHand().copyTo(grabbedImage);
    Application.Imgproc.cvtColor(grabbedImage, grabbedImage, Imgproc.COLOR_BGR2GRAY);
    Application.Imgproc.resize(grabbedImage, grabbedImage, new Application.Size(64, 128));
    desc.compute(grabbedImage, descVals);
    return descVals;
}