public static void main(java.lang.String[] args) {
    java.io.File in = new java.io.File(args[0]);
    GaussianBlur.orig = new Picture(in);
    GaussianBlur.lowpass = GaussianBlur.orig;
    GaussianBlur.highpass = GaussianBlur.orig;
    GaussianBlur.makeSliders();
    GaussianBlur.updateBlur();
}