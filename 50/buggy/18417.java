public static float getA(int color) {
    int a = color >> 24;
    return a == 0 ? 1.0F : ((float) (a & 255)) / 255.0F;
}