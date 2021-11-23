private void handleGetTimingAction(com.sikhcentre.models.MediaPlayerServiceModel mediaPlayerServiceModel) {
    com.sikhcentre.media.SikhCentreMediaPlayer.LOGGER.debug("brinder setting time");
    java.lang.String totalTime = convertMillisToTimeString(mediaPlayerServiceModel.getDuration());
    java.lang.String pendingTime = convertMillisToTimeString(mediaPlayerServiceModel.getCurrentPosition());
    durationTV.setText(((pendingTime + "/") + totalTime));
}