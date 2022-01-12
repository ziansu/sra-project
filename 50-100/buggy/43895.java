public static com.googlecode.leptonica.android.Pix projectiveTransform(com.googlecode.leptonica.android.Pix pixs, float[] dest, float[] src) {
    if (pixs == null) {
        throw new java.lang.IllegalArgumentException("Source pix must be non-null");
    }
    final long result = com.googlecode.leptonica.android.Projective.nativeProjectivePtaColor(pixs.getNativePix(), dest, src);
    return new com.googlecode.leptonica.android.Pix(result);
}