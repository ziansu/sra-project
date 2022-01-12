private double cosNumerator(double[] vector) {
    double cosValue = 0;
    for (int ii = 0; ii < (Storage.BackData.vocabAfter); ii++) {
        cosValue = cosValue + ((vector[ii]) * (qVector[ii]));
    }
    return cosValue;
}