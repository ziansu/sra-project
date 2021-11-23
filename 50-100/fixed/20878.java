private static int[] prependMiniBatchSize(int[] shape, int miniBatchSize) {
    int shapeLength = shape.length;
    int[] miniBatchShape = new int[shapeLength + 1];
    for (int i = 0; i < (miniBatchShape.length); i++) {
        if (i == 0)
            miniBatchShape[i] = miniBatchSize;
        else
            miniBatchShape[i] = shape[(i - 1)];
        
    }
    return miniBatchShape;
}