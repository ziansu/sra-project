public void qFunction() {
    getMax();
    currentNetQVal = calcNewPrevQVal();
    out.println(("prevQVal " + (currentNetQVal)));
    double[] Ycalc = new double[1];
    Ycalc[0] = previousNetQVal;
    double expectedYVal = currentNetQVal;
    runBackProp(currentStateActionVector, expectedYVal, Ycalc, flagActivation);
}