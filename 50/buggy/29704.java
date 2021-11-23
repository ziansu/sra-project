public double[] read(long offset, double[] data) {
    return read(offset, ((int) (((getLength()) - offset) + 1)), data);
}