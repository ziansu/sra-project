public boolean relocate(double[] pos) {
    if (pos == null) {
        return true;
    }
    return relocate(pos[0], pos[1]);
}