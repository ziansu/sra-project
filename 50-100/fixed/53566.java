public void run() {
    if (org.swain.asa.famous_pres_speeches.Model.CurrentlyPlaying.getCurrentlyPlayingService().isSpeechPlaying()) {
        currentlyPlayingButton.setText(currentActivity.getResources().getString(R.string.pause_button));
    }else {
        currentlyPlayingButton.setText(currentActivity.getResources().getString(R.string.play_button));
    }
}