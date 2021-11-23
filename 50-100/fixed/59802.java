private void writeHalfNibble(int b) {
    b &= 3;
    if ((DATA_BITS) == 2) {
        int sample = samples.getRawSample(index);
        sample = (sample & -4) | (b & 3);
        samples.setRawSample(index, sample);
        (index)++;
    }else {
        writeBit(b);
        writeBit((b >> 1));
    }
}