public int getNumerator(int value, int cents) {
    com.google.common.base.Preconditions.checkArgument((((value >= 0) && (cents >= 0)) && (cents < 100)));
    return (value * 100) + cents;
}