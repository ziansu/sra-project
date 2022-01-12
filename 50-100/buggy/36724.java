@java.lang.Override
public void onInitializationFailure(com.google.android.youtube.player.YouTubePlayer.Provider provider, com.google.android.youtube.player.YouTubeInitializationResult youTubeInitializationResult) {
    if (youTubeInitializationResult.isUserRecoverableError()) {
        youTubeInitializationResult.getErrorDialog(mAttachedActivity, com.worldspotlightapp.android.ui.videodetails.VideoDetailsFragment.RECOVERY_DIALOG_REQUEST).show();
    }else {
        java.lang.String errorMessage = java.lang.String.format(getString(R.string.error_player), youTubeInitializationResult.toString());
        android.widget.Toast.makeText(mAttachedActivity, errorMessage, Toast.LENGTH_SHORT).show();
    }
}