@java.lang.Override
public void onBackPressed() {
    android.content.Intent i = new android.content.Intent(this, com.nickjames.polychromatictuner.TunerActivity.class);
    if ((currentInstrument) != null) {
        i.putExtra(com.nickjames.polychromatictuner.SelectTuningActivity.INSTRUMENT, currentInstrument.ordinal());
    }
    if ((currentTuning) != null) {
        i.putExtra(com.nickjames.polychromatictuner.SelectTuningActivity.TUNING, currentTuning.getOrdinal());
    }
    setResult(com.nickjames.polychromatictuner.RESULT_OK, i);
    java.lang.System.out.println(i.getExtras().toString());
    finish();
}