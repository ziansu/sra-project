public static org.opencv.core.Mat getCapturedImage() {
    if ((communications.VisionProcessorClient.cap.isOpened()) == false) {
        communications.VisionProcessorClient.cap.retrieve(communications.VisionProcessorClient.image);
        return communications.VisionProcessorClient.image;
    }else {
        return null;
    }
}