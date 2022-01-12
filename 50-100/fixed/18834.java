public static int rowNumber(int index, org.nd4j.linalg.api.ndarray.INDArray arr) {
    double otherTest = ((double) (index)) / (arr.size((-1)));
    int test = ((int) (java.lang.Math.floor(otherTest)));
    int vectors = arr.vectorsAlongDimension((-1));
    if (test >= vectors)
        return vectors - 1;
    
    return test;
}