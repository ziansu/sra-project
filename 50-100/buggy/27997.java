public void qFunction() {
    getMax();
    currentNetQVal = calcNewPrevQVal();
    out.println(("prevQVal " + (currentNetQVal)));
    double[] Ycalc = new double[0];
    Ycalc[0] = previousNetQVal;
    double expectedYVal = currentNetQVal;
    runBackProp(currentStateActionVector, expectedYVal, Ycalc, flagActivation);
}