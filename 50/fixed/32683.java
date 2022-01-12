void compress(int[] picarraytemp) {
    picarray = picarraytemp;
    rgbtoyuv(picarray, picarray.length);
    DCT(YCbCrarray, 0, 0, 0);
    java.lang.System.out.println("Fin");
}