@java.lang.Override
public void onResume() {
    super.onResume();
    if (NfcAdapter.ACTION_NDEF_DISCOVERED.equals(getIntent().getAction())) {
        processIntent(getIntent());
    }
    long prev_id = getLastEventId(getContentResolver());
    if (prev_id == (prefs.getKey(prefs.EVENT_KEY))) {
        com.krkeco.dateit.widget.WidgetProvider.setText(this.getApplicationContext());
    }
}