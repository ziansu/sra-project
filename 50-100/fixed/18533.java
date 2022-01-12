public int predict(java.io.File faceImgFile) {
    int label;
    com.example.fanchaozhou.project3.CvMat face = cvLoadImageM(faceImgFile.getPath(), com.example.fanchaozhou.project3.CV_LOAD_IMAGE_GRAYSCALE);
    com.example.fanchaozhou.project3.CvMat grayFace = face.clone();
    cvEqualizeHist(face, grayFace);
    label = faceRecognizer.predict(grayFace);
    java.lang.System.out.println(label);
    java.lang.System.out.println(faceImgFile.getPath());
    return label;
}