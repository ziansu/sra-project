public java.lang.String compressFromString(java.lang.String text) {
    if ((this.frequencyStat) == null) {
        this.frequencyStat = this.getCharacterFrequencyFromString(text);
    }
    return this.compress(text);
}