public float[] transformToPose(float[] transform) {
    float[] arr = new float[3];
    arr[0] = transform[3];
    arr[1] = transform[7];
    arr[2] = transform[11];
    return arr;
}