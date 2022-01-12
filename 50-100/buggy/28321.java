public float[] transformToPose(float[] transform) {
    float[] arr = new float[3];
    arr[0] = transforms[3];
    arr[1] = transforms[7];
    arr[2] = transforms[11];
    return arr;
}