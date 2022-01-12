public static int getRed(int val) {
    return (val & (processing.core.PImage.RED_MASK)) >> 16;
}