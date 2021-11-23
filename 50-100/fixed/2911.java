public java.nio.FloatBuffer putInBuffer(java.nio.FloatBuffer buffer) {
    buffer.put(s00).put(s10).put(s20);
    buffer.put(s01).put(s11).put(s21);
    buffer.put(s02).put(s12).put(s22);
    return buffer;
}