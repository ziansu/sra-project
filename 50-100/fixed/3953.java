public int getScalePitch(int degree) {
    int remainder = degree % 7;
    int octave = degree / 7;
    if (remainder < 0) {
        octave--;
        remainder += 7;
    }
    int pitchClass = scalePitches[remainder];
    return pitchClass + (octave * 12);
}