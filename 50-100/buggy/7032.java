@java.lang.Override
public org.nd4j.linalg.api.ndarray.INDArray scalar(float value) {
    if ((dtype) == (DataBuffer.Type.FLOAT))
        return create(new float[]{ value }, new int[]{ 1 }, new int[]{ 1 }, 0);
    else
        if ((dtype) == (DataBuffer.Type.DOUBLE))
            return scalar(((double) (value)));
        else
            return scalar(((int) (value)));
        
    
}