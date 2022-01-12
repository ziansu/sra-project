private void setText(char[] input) {
    int i = 0;
    byte[] localBytes = new byte[input.length];
    while (i < (input.length)) {
        localBytes[j] = bitwiseEndianShift(java.lang.Character.getNumericValue(input[i]));
        i++;
    } 
    text = localBytes;
}