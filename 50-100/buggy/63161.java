private int search(int input, int[] passIn, int startIndex, int endIndex) {
    int midI = (startIndex + endIndex) / 2;
    int tmp = input[midI];
    if (midI == startIndex) {
        return tmp;
    }else
        if (tmp <= input) {
            tmp = search(input, passIn, midIndex, endIndex);
        }else
            if (tmp > input) {
                tmp = search(input, passIn, startIndex, midIndex);
            }
        
    
    return tmp;
}