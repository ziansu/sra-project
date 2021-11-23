void putColor(float r, float g, float b, float a) {
    try {
        color.put(r).put(g).put(b).put(a);
    } catch (java.nio.BufferOverflowException e) {
    }
}