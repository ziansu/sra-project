private org.opencv.samples.CNN.Conv loadConv(java.lang.String namebase) {
    java.util.ArrayList<java.util.ArrayList<org.opencv.core.Mat>> layer = loadMat4FromFile(namebase);
    org.opencv.core.Mat biases = loadMat2FromFile((namebase + "b"), 1, f);
    return new org.opencv.samples.CNN.Conv(layer, biases);
}