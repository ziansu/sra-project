public static void releaseDetector() {
    if ((com.rohitarya.picasso.facedetection.transformation.core.PicassoFaceDetector.faceDetector) != null) {
        com.rohitarya.picasso.facedetection.transformation.core.PicassoFaceDetector.faceDetector.release();
    }
}