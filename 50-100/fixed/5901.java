public static double[] realToComplex(short[] realInput) {
    double[] complexOutput = new double[(realInput.length) * 2];
    for (int i = 0; i < (complexOutput.length); i++) {
        if ((i % 2) == 0) {
            complexOutput[i] = realInput[(i / 2)];
        }else {
            complexOutput[i] = 0;
        }
    }
    return complexOutput;
}