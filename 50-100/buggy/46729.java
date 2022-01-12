public float[] getData() {
    float[] data = new float[mLabelsData.length];
    for (int i = 0; i < (mData.length); i++) {
        data[i] = mData[i];
    }
    return data;
}