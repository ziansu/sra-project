private void setInputNeurons(double[] input) {
    if ((inputNeurons.length) != (input.length)) {
        throw new java.lang.IllegalArgumentException((((("Input is not the right dimension.  Expected " + (inputNeurons.length)) + ". Was ") + (input.length)) + "."));
    }
    for (int i = 0; i < (inputNeurons.length); i++) {
        inputNeurons[i] = input[i];
    }
}