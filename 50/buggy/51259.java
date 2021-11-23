private void handleSeekBarMovedAction() {
    com.sikhcentre.media.SikhCentreMediaPlayer.LOGGER.debug("Brinder Seek Bar Moved Complete");
    com.sikhcentre.utils.UIUtils.dismissProgressBar(progressDialog);
    resetAction();
}