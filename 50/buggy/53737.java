public boolean isPrime() {
    for (int Divisor = 2; Divisor < ((RANDOM_NUMBER) / 2); Divisor++) {
        if (((RANDOM_NUMBER) % Divisor) == 0)
            return false;
        
    }
    return true;
}