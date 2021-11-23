public int getValue(java.util.ArrayList<java.lang.Integer> cards) {
    int j = 0;
    for (int i : cards) {
        if (i == 0) {
            if ((j + 11) > 21)
                j = j + 1;
            else
                j = j + 11;
            
        }else
            j = (j + i) + 1;
        
    }
    return j;
}