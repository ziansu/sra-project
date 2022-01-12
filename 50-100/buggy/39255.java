@java.lang.Override
protected void onActivityResult(final int requestCode, final int resultCode, final android.content.Intent intent) {
    android.net.Uri uri = intent.getParcelableExtra(RingtoneManager.EXTRA_RINGTONE_PICKED_URI);
    if ((resultCode == (android.app.Activity.RESULT_OK)) && (requestCode == 5)) {
        ringVib.getRing().setRingtone(uri);
    }
}