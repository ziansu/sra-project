public static double calculateAverageHeartRate(@android.support.annotation.NonNull
final java.util.List<java.lang.Integer> heartRates) {
    if (heartRates.isEmpty())
        return 0;
    
    int sum = 0;
    for (int measurement : heartRates) {
        android.util.Log.i(gr.atc.evotion.watch.HeartRateAvgUtil.TAG, java.lang.String.valueOf(measurement));
        sum += measurement;
    }
    android.util.Log.d(gr.atc.evotion.watch.HeartRateAvgUtil.TAG, java.lang.String.valueOf(sum));
    double average = sum / (heartRates.size());
    return (java.lang.Math.round((average * 100.0))) / 100.0;
}