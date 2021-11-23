public float[] read(long offset, float[] data) {
    return read(offset, ((int) (((getLength()) - offset) + 1)), data);
}