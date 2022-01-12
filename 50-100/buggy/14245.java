protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (com.studio4plus.homerplayer.ui.MainActivity.TTS_CHECK_CODE)) {
        if (resultCode == (TextToSpeech.Engine.CHECK_VOICE_DATA_PASS)) {
            speaker = new com.studio4plus.homerplayer.ui.Speaker(this);
        }else {
            android.content.Intent installIntent = new android.content.Intent();
            installIntent.setAction(TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA);
            startActivity(installIntent);
        }
    }
}