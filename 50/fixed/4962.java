protected int digitsSumCycle(int input) {
    int result = 0;
    while (input > 0) {
        result += input--;
    } 
    return result;
}