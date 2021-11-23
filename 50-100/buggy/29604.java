private void counterAppend(int e) {
    counters[counterLength] = e;
    (counterLength)++;
    if ((counterLength) >= (counterLength)) {
        int[] temp = new int[(counterLength) * 2];
        java.lang.System.arraycopy(counters, 0, temp, 0, counterLength);
        counters = temp;
    }
}