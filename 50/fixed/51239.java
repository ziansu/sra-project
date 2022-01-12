public float[] read(long offset, float[] data) {
    return read(offset, ((int) ((getLength()) - offset)), data);
}