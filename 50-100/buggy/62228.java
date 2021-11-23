public static int sizeOfInt16(short value) {
    if ((0 <= value) && (value < (adata.Stream.const_tag_as_type)))
        return 1;
    
    if (value < 0)
        value = ((short) (-value));
    
    if (value < 256)
        return 2;
    
    return 3;
}