public void printTo(org.opencv.core.Mat Z, org.opencv.core.Mat dst, org.opencv.core.Mat shape) {
    org.opencv.core.Mat X = getXfromZ(Z).reshape(1, resolutionY);
    AffineTexture(X, stdShape, dst, shape, delaunay);
}