private int search(int input, int[] passIn, int startIndex, int endIndex) {
    int midI = (startIndex + endIndex) / 2;
    int tmp = passIn[midI];
    if (midI == startIndex) {
        return midI;
    }else
        if (tmp <= input) {
            midI = search(input, passIn, midI, endIndex);
        }else
            if (tmp > input) {
                midI = search(input, passIn, startIndex, midI);
            }
        
    
    return midI;
}