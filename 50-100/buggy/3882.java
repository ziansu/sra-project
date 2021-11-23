private double cosNumerator(double[] vector) {
    int cosValue = 0;
    for (int ii = 0; ii < (Storage.BackData.vocabAfter); ii++) {
        cosValue += (vector[ii]) * (qVector[ii]);
    }
    return cosValue;
}