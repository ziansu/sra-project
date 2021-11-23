private void handleStartAction(com.sikhcentre.models.MediaPlayerServiceModel mediaPlayerServiceModel) {
    com.sikhcentre.utils.UIUtils.dismissProgressBar(progressDialog);
    seekBar.setEnabled(true);
    seekBar.setMax(mediaPlayerServiceModel.getDuration());
    handleGetTimingAction(mediaPlayerServiceModel);
    imageView.setImageResource(R.drawable.ic_pause_circle_outline_blue_900_24dp);
    startGetTimingDisposable();
}