public short[] read(long offset, short[] data) {
    return read(offset, ((int) (((getLength()) - offset) + 1)), data);
}