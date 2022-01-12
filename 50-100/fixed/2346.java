private boolean IncrementArray(int[] current, int[] numDigits) {
    for (int x = (current.length) - 1; x >= 0; x--) {
        if (((current[x]) + 1) == (numDigits[x])) {
            current[x] = 0;
            continue;
        }else {
            (current[x])++;
            return true;
        }
    }
    return false;
}