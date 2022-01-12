public int getColor() {
    int[] result = new int[4];
    for (int i = 0; i < 4; i++) {
        result[i] = ((int) ((this.argb[i]) * 255));
    }
    int color = android.graphics.Color.argb(result[0], result[1], result[2], result[3]);
    return color;
}