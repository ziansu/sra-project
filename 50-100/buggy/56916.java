public static int sizeOfInt32(int value) {
    if ((0 <= value) && (value < (adata.Stream.const_tag_as_type)))
        return 1;
    
    if (value < 0)
        value = ((int) (-value));
    
    if (value < 256)
        return 2;
    
    if (value < 65536)
        return 3;
    
    if (value < 16777216)
        return 4;
    
    return 5;
}