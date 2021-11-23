public static android.content.Intent createIntent(final android.content.Context context, com.vlabs.medicinetracker.singleMeasurement.mvp.SMInstance extra) {
    final android.content.Intent intent = new android.content.Intent(context, com.vlabs.medicinetracker.singleMeasurement.SingleMeasurementActivity.class);
    intent.putExtra(com.vlabs.medicinetracker.singleMeasurement.SingleMeasurementActivity.PRESENTER_TYPE_KEY, extra);
    return intent;
}