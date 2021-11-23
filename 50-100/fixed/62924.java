public int[] getPixels() {
    int c = 0;
    int[] p = new int[(width) * (height)];
    for (int i = 0; i < (height); i++) {
        for (int j = 0; j < (width); j++) {
            p[(c++)] = pixels[j][i];
        }
    }
    return p;
}