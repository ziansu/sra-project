public static float getA(int color) {
    return ((float) ((color >> 24) & 255)) / 255.0F;
}