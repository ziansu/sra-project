public int getScore() {
    return ((hitOnsets) * (hitOnsets)) - ((missedOnsets) * (missedOnsets));
}