@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    try {
        result = com.teinproductions.tein.smartcalc.maths.PrimeCalculator.factorize(input, this);
    } catch (java.lang.NumberFormatException e) {
        e.printStackTrace();
    }
    return null;
}