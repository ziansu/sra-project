@java.lang.Override
public void onResume() {
    super.onResume();
    log("on resume");
    if (NfcAdapter.ACTION_NDEF_DISCOVERED.equals(getIntent().getAction())) {
        log("being process intent");
        processIntent(getIntent());
    }else {
        log("resume was not due to nfc");
    }
    long prev_id = getLastEventId(getContentResolver());
    log(("retrieved id is " + prev_id));
    if (prev_id == (prefs.getKey(prefs.EVENT_KEY))) {
        com.krkeco.dateit.widget.WidgetProvider.setText(this.getApplicationContext());
    }
}