public boolean matches(double number) {
    double value = ((mod) == 1) ? number : number % (mod);
    if (integer) {
        return false;
    }
    return (((low) <= value) && (value <= (high))) != (negated);
}