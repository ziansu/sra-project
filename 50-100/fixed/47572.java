public int RGBAtoInt(int[] rgba) {
    int rgbaValue = rgba[2];
    rgbaValue += (rgba[1]) << 8;
    rgbaValue += (rgba[0]) << 16;
    rgbaValue += (rgba[3]) << 24;
    return rgbaValue;
}