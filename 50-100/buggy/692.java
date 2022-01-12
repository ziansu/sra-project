public static float diff(float[] rgb1, float[] rgb2) {
    return ((java.lang.Math.abs(((rgb2[0]) - (rgb1[0])))) + (java.lang.Math.abs(((rgb2[1]) - (rgb1[1]))))) + (java.lang.Math.abs(((rgb2[2]) - (rgb1[2]))));
}