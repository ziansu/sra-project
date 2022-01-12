public int getScalePitch(int degree) {
    int remainder = degree % 7;
    if (remainder < 0) {
        remainder += 7;
    }
    int pitchClass = scalePitches[remainder];
    int octave = degree / 7;
    return pitchClass + (octave * 12);
}