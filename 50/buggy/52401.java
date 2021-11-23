public java.lang.String compressFromString(java.lang.String text) {
    if ((this.frequencyStat) == null) {
        java.lang.System.out.println("NULL!");
        this.frequencyStat = this.getCharacterFrequencyFromString(text);
    }
    return this.compress(text);
}