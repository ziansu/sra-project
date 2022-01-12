protected int digitsSumRecursion(int input) {
    if (input == 1) {
        return 1;
    }else
        if (input == 0) {
            return 0;
        }else {
            return input + (digitsSumRecursion((--input)));
        }
    
}