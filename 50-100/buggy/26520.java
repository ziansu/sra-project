public void putInBuffer(java.nio.FloatBuffer buffer) {
    switch (colorType) {
        case pe.util.color.Color.RGB :
        case pe.util.color.Color.CMY :
            putInBuffer3(buffer);
        case pe.util.color.Color.RGBA :
        case pe.util.color.Color.CMYA :
            putInBuffer4(buffer);
    }
    throw new java.lang.IllegalArgumentException(("This color has a unknown 'colorType' value of: " + (colorType)));
}