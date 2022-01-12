private float[] cutArray(int index) {
    float[] retArr = new float[filterSize];
    int j = 0;
    for (int i = index - (side); i < (index + (side)); i++) {
        retArr[j] = array[i];
        j++;
    }
    return retArr;
}