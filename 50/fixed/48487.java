private void UiOnAccidentDetected() {
    android.util.Log.d(maustemies.halyttaja.MainActivity.LOG_TAG_MAIN_ACTIVITY, "UiOnAccidentDetected()");
    textViewStatus.setText(R.string.textAccidentDetected);
    textViewAdvice.setText(R.string.textAdvicePressStopToStopAlarm);
}