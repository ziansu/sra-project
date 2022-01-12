private static int[] prependMiniBatchSize(int[] shape, int miniBatchSize) {
    int shapeLength = shape.length;
    int[] miniBatchShape = new int[shapeLength + 1];
    for (int i : miniBatchShape) {
        if (i == 0)
            miniBatchShape[i] = miniBatchSize;
        else
            miniBatchShape[i] = shape[i];
        
    }
    return miniBatchShape;
}