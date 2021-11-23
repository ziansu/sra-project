private int isFullHouse(int[] valueAry, int size) {
    int retval;
    java.lang.Boolean checkFor2s = false;
    retval = isThreeOfKind(valueAry, size);
    if (retval > (-1)) {
        retval *= 100;
        checkFor2s = true;
    }
    if (checkFor2s) {
        for (int i = 1; i < size; i++)
            if ((valueAry[i]) == 2)
                retval += i;
            
        
    }
    return retval;
}