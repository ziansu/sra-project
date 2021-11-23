@java.lang.Override
public org.nd4j.linalg.api.ndarray.INDArray scalar(double value) {
    if ((dtype) == (DataBuffer.Type.DOUBLE))
        return create(new double[]{ value }, new int[]{ 1 }, new int[]{ 1 }, 0);
    else
        return scalar(((float) (value)));
    
}