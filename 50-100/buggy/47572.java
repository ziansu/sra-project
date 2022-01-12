public int RGBAtoInt(int[] rgba) {
    int rgbaValue = rgba[0];
    rgbaValue += (rgba[1]) << 8;
    rgbaValue += (rgba[2]) << 16;
    rgbaValue += (rgba[3]) << 24;
    return rgbaValue;
}