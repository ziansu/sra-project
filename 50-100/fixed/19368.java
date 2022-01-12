public static double[] transform(double[] input) {
    int length = input.length;
    if ((length & (length - 1)) != 0)
        throw new java.lang.RuntimeException("input length not power of 2");
    
    double[][] complex = toComplex(input);
    complex = musicrecognition.math.Fourier.transform(complex);
    for (int i = 0; i < length; i++)
        input[i] = complex[i][0];
    
    return input;
}