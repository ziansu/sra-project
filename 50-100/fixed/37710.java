private void writeNibble(int b) {
    b &= 15;
    if ((DATA_BITS) == 4) {
        int sample = samples.getRawSample(index);
        sample = (sample & -16) | (b & 15);
        samples.setRawSample(index, sample);
        (index)++;
    }else {
        writeHalfNibble(b);
        writeHalfNibble((b >> 2));
    }
}