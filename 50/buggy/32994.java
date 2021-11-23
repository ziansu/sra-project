private int findHighCard(int[] valueAry, int size) {
    for (int i = size; i > 0; i--)
        if ((valueAry[i]) > 0)
            return i;
        
    
    return -1;
}