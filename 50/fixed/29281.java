private int getEditIndex(java.lang.String input, int editIndexPosition) {
    java.lang.String[] output = input.split(ONE_SPACING);
    return (java.lang.Integer.parseInt(output[editIndexPosition])) - 1;
}