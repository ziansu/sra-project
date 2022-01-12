void processDiffFrame() {
    org.opencv.core.Mat tDiffImg = diffImg;
    org.opencv.core.Mat element;
    if (diffImg.empty())
        return ;
    
    com.digitalwonders.ilhan.trackcolor.Imgproc.threshold(tDiffImg, tDiffImg, 1, 255, Imgproc.THRESH_BINARY);
    element = com.digitalwonders.ilhan.trackcolor.Imgproc.getStructuringElement(Imgproc.MORPH_ELLIPSE, kernelOpen);
    com.digitalwonders.ilhan.trackcolor.Imgproc.erode(tDiffImg, tDiffImg, element);
    com.digitalwonders.ilhan.trackcolor.Imgproc.dilate(tDiffImg, tDiffImg, element);
    element = com.digitalwonders.ilhan.trackcolor.Imgproc.getStructuringElement(Imgproc.MORPH_RECT, kernelClose);
    com.digitalwonders.ilhan.trackcolor.Imgproc.morphologyEx(tDiffImg, tDiffImg, Imgproc.MORPH_CLOSE, element);
}