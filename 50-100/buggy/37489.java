public static int calculateWaysOfClimpbing(int n) {
    if (n < 0)
        return 0;
    
    if (n == 0)
        return 0;
    
    if (n == 1)
        return 1;
    
    int sum = 0;
    for (int k = 0; k <= 3; k++) {
        sum += com.epam.Staircase.calculateWaysOfClimpbing((n - k));
    }
    return sum;
}