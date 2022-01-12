public java.lang.String toString() {
    java.lang.String s = "";
    for (int i = 0; i < (wid); i++) {
        for (int j = 0; j < (hei); j++) {
            for (int k = 0; k < 3; k++) {
                s = (s + " ") + (image[i][j][k]);
            }
        }
    }
    return s;
}