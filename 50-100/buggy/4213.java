private java.util.ArrayList<cosbas.biometric.validators.facial.IplImage> initEigenVectors(int nEigens, cosbas.biometric.validators.facial.CvSize faceImgSize) {
    java.util.ArrayList<cosbas.biometric.validators.facial.IplImage> eigenVectors = new java.util.ArrayList<>(nEigens);
    for (int i = 0; i < nEigens; i++) {
        eigenVectors.set(i, cvCreateImage(faceImgSize, cosbas.biometric.validators.facial.IPL_DEPTH_32F, 1));
    }
    return eigenVectors;
}