public int nextPower() {
    add(digits, delta, moreDigits);
    add(delta, deltaDelta, moreDelta);
    int i = 0;
    for (; (i < (digits.length)) && ((digits[i]) == 0); i++);
    return i;
}