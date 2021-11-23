@java.lang.Override
public void onInitializationFailure(com.google.android.youtube.player.YouTubePlayer.Provider provider, com.google.android.youtube.player.YouTubeInitializationResult youTubeInitializationResult) {
    youtubePlayer = null;
    if (youTubeInitializationResult.isUserRecoverableError()) {
        youTubeInitializationResult.getErrorDialog(getActivity(), app.vedicnerd.ytwua.fragment.YoutubePlayerFragment.RECOVERY_DIALOG_REQUEST).show();
    }else {
        if (isAdded()) {
            android.widget.Toast.makeText(getActivity().getApplicationContext(), getString(R.string.error_init_failure_msg), Toast.LENGTH_SHORT).show();
        }
    }
}