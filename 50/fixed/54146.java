public int[] read(long offset, int[] data) {
    return read(offset, ((int) ((getLength()) - offset)), data);
}