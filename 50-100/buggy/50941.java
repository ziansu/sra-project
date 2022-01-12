private int isTwoPair(int[] valueAry, int size) {
    int first = 0;
    int second = 0;
    for (int i = size; i > 0; i--) {
        if ((valueAry[i]) == 2) {
            if (first == 0)
                first = i;
            else
                second = i;
            
        }
    }
    if ((first > 0) && (second > 0))
        return (first * 100) + second;
    
    return -1;
}