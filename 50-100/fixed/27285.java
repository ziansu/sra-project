@java.lang.Override
public void onBackPressed() {
    android.content.Intent i = new android.content.Intent(this, com.nickjames.polychromatictuner.TunerActivity.class);
    if (((currentInstrument) != null) && ((currentTuning) != null)) {
        i.putExtra(com.nickjames.polychromatictuner.SelectTuningActivity.INSTRUMENT, currentInstrument.ordinal());
        i.putExtra(com.nickjames.polychromatictuner.SelectTuningActivity.TUNING, currentTuning.getOrdinal());
    }
    setResult(com.nickjames.polychromatictuner.RESULT_OK, i);
    finish();
}