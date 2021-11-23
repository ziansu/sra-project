public static int[] getInputsLengths(int[][] inputs) {
    int[] lengths = new int[inputs.length];
    for (int i = 0; i < (inputs.length); i++) {
        lengths[i] = inputs[i].length;
    }
    return lengths;
}