public static int findBytes(java.util.LinkedList<java.lang.Byte> arr, byte value) {
    int i = 0;
    while (((arr.get(i)) != value) && (i < (arr.size())))
        i++;
    
    if (i < (arr.size()))
        return i;
    
    return -1;
}