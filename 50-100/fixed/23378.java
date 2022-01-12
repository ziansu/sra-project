@java.lang.Override
public int stride(int dimension) {
    int rank = org.nd4j.linalg.api.shape.Shape.rank(shapeInformation);
    if (dimension < 0)
        return org.nd4j.linalg.api.shape.Shape.stride(shapeInformation).getInt((dimension + rank));
    
    return org.nd4j.linalg.api.shape.Shape.stride(shapeInformation).getInt(dimension);
}