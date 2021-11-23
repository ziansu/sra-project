@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    try {
        java.lang.Integer[] resultArray = com.teinproductions.tein.smartcalc.maths.PrimeCalculator.factorize(input, this);
        outputResult(resultArray);
    } catch (java.lang.NumberFormatException e) {
        e.printStackTrace();
    }
    return null;
}