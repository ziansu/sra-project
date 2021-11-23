public static double[] average() {
    double[] avg = new double[784];
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < (neuronalnetworks.Test.images[0].length); j++) {
            avg = neuronalnetworks.Test.arraySum(avg, neuronalnetworks.Test.images[i][j]);
        }
    }
    return neuronalnetworks.Test.arrayDivide(avg, 40000);
}