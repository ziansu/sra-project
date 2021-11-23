public int nextPower() {
    int i = 0;
    for (; (i < (digits.length)) && ((digits[i]) == 0); i++);
    add(digits, delta, moreDigits);
    add(delta, deltaDelta, moreDelta);
    return i;
}