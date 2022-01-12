@java.lang.Override
public float getWidthFromFont(int code) throws java.io.IOException {
    if (((getStandard14AFM()) != null) && ((getEncoding()) != null)) {
        return getStandard14Width(code);
    }
    int gid = codeToGID(code);
    float width = ttf.getAdvanceWidth(gid);
    float unitsPerEM = ttf.getUnitsPerEm();
    if (unitsPerEM != 1000) {
        width *= 1000.0F / unitsPerEM;
    }
    return width;
}