public java.awt.image.BufferedImage applyHomography(java.awt.image.BufferedImage img) {
    synchronized(synchronizedMatrix) {
        if ((homographyMatrix) != null) {
            com.googlecode.javacv.cpp.opencv_core.IplImage in = com.googlecode.javacv.cpp.opencv_core.IplImage.createFrom(img);
            cvWarpPerspective(in, in, homographyMatrix);
            return in.getBufferedImage();
        }else {
            return null;
        }
    }
}