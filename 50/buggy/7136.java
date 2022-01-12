private int getSize(int width, int maxMem, int stat) {
    return ((int) ((((float) (stat)) / ((float) (maxMem))) * width));
}