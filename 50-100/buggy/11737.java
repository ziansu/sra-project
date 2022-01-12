public static float[] getFloatArrayFromBuffer(java.nio.FloatBuffer buffer) {
    float[] array = null;
    if (buffer != null) {
        if (buffer.hasArray()) {
            array = buffer.array();
        }else {
            buffer.rewind();
            array = new float[buffer.capacity()];
            buffer.get(array);
        }
    }
    return array;
}