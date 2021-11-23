@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, com.example.utente.calcolaorauscita.Intent data) {
    if (requestCode == (com.example.utente.calcolaorauscita.MainActivity.RingTonePickerRequestCode))
        if (resultCode == (RESULT_OK))
            uriRingTone = data.getParcelableExtra(RingtoneManager.EXTRA_RINGTONE_PICKED_URI);
        else
            uriRingTone = android.media.RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        
    
    if (requestCode == (com.example.utente.calcolaorauscita.MainActivity.SHARE_PICKER)) {
        if (imagePath.exists()) {
            imagePath.delete();
        }
    }
}