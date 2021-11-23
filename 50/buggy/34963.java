protected int digitsSumRecursion(int input) {
    if (input == 1) {
        return 1;
    }else {
        return input + (digitsSumRecursion((--input)));
    }
}