public static java.lang.String getMeasurementText(android.content.Context context, double bufferInMeters, boolean useMetric) {
    int buffer = ((int) ((useMetric) ? bufferInMeters : java.lang.Math.round(com.airmap.airmapsdk.util.Utils.metersToFeet(bufferInMeters))));
    return context.getString((useMetric ? R.string.units_meter_short : R.string.units_feet_short), buffer);
}