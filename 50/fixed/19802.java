protected int factorialCycle(int input) {
    if (input == 0) {
        return 0;
    }
    int result = 1;
    while (input > 0) {
        result *= input--;
    } 
    return result;
}