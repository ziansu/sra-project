public boolean[] read(long offset, boolean[] data) {
    return read(offset, ((int) ((getLength()) - offset)), data);
}