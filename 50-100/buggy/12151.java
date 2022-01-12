@java.lang.Override
public int linearIndex(int i) {
    setLinearStride();
    int idx = i;
    for (int j = 0; j < ((org.nd4j.linalg.api.shape.Shape.rank(shapeInformation.asNioInt())) - 1); j++) {
        if ((size(i)) == 1)
            continue;
        
        idx += i * (stride(j));
    }
    return (org.nd4j.linalg.api.shape.Shape.offset(shapeInfo())) + idx;
}