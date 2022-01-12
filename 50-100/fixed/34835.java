public int getNumMissing() {
    int missing = 0;
    for (int i = 0; i < (this.numPieces); i++) {
        if (!(this.myBitField.get(i))) {
            missing += 1;
        }
    }
    return missing;
}