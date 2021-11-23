public static int sizeOfInt32(int value) {
    if ((0 <= value) && (value < (adata.Stream.const_tag_as_type)))
        return 1;
    
    long temp = value;
    if (value < 0)
        temp = -value;
    
    if (temp < 256)
        return 2;
    
    if (temp < 65536)
        return 3;
    
    if (temp < 16777216)
        return 4;
    
    return 5;
}