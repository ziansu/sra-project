public double CalcularR5(double SMPS, double R6) {
    android.util.Log.e(com.example.miguelpc.smps.AmplificadorDifActivity.TAG, ("SMPS: " + (java.lang.String.valueOf(SMPS))));
    android.util.Log.e(com.example.miguelpc.smps.AmplificadorDifActivity.TAG, ("R6: " + (java.lang.String.valueOf(R6))));
    double result = ((SMPS / 6.5) - 1) * R6;
    android.util.Log.e(com.example.miguelpc.smps.AmplificadorDifActivity.TAG, ("R5: " + (java.lang.String.valueOf(result))));
    return result;
}