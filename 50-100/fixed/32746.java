private int freqChecker(int[] freq) {
    boolean all = true;
    boolean invalid = false;
    for (int i = 1; i <= 9; i++) {
        if ((freq[i]) > 1) {
            invalid = true;
        }
        if ((freq[i]) != 1) {
            all = false;
        }
    }
    if ((!invalid) && all)
        return 1;
    else
        if (!invalid)
            return 0;
        else
            return -1;
        
    
}