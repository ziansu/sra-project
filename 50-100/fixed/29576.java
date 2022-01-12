@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == (com.spotify.sdk.android.authentication.LoginActivity.REQUEST_CODE)) {
        if (resultCode == (RESULT_OK)) {
            android.util.Log.d(agency.tango.skald.example.DeezerActivity.TAG, "Authentication completed");
            skaldMusicService.prepare();
        }else {
            android.util.Log.e(agency.tango.skald.example.DeezerActivity.TAG, "Authentication went wrong");
        }
    }
}