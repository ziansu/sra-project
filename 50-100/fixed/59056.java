public boolean isValidPerfectNumber(int number) {
    int sum = 1;
    for (int divisors = 2; divisors <= (number / 2); divisors++) {
        if ((number % divisors) == 0) {
            sum += divisors;
        }
    }
    if ((sum != 1) && (number == sum))
        return true;
    
    return false;
}