@java.lang.Override
public int stride(int dimension) {
    int rank = org.nd4j.linalg.api.shape.Shape.rank(shapeInformation.asNioInt());
    if (dimension < 0)
        return org.nd4j.linalg.api.shape.Shape.stride(shapeInformation.asNioInt()).get((dimension + rank));
    
    return org.nd4j.linalg.api.shape.Shape.stride(shapeInformation.asNioInt()).get(dimension);
}