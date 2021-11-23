public static int problemTwo(int max) {
    if (max == 0) {
        return 0;
    }
    int previousFib = 0;
    int currentFib = 1;
    int output = 0;
    while (currentFib < max) {
        int newFib = previousFib + currentFib;
        previousFib = currentFib;
        currentFib = newFib;
        if ((currentFib % 2) == 0) {
            output = output + currentFib;
        }
    } 
    return output;
}