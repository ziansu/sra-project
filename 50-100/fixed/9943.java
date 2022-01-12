public void soundDb(double ampl) {
    if ((20 * (java.lang.Math.log10(((getAmplitudeEMA()) / ampl)))) > 0)
        values.add((20 * (java.lang.Math.log10(((getAmplitudeEMA()) / ampl)))));
    
    android.util.Log.d("Sound", java.lang.String.valueOf((20 * (java.lang.Math.log10(((getAmplitudeEMA()) / ampl))))));
}