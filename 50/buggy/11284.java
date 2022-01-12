private int accumulate(int[] folders, int start) {
    int accum = start;
    for (int folder : folders) {
        accum += folder;
    }
    return accum;
}