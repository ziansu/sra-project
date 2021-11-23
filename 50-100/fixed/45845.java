private void updateClockHelper(long playerPos) {
    if (((playerSource) == null) || ((playerSource.show) == null)) {
        return ;
    }
    long totalShowTime = playerSource.show.getTotalShowTimeMillis();
    podcastDetails.setText(org.kfjc.android.player.util.DateUtil.formatTime((playerPos - (show.getHourPaddingTimeMillis()))));
    playtimeSeekBar.setMax((((int) (totalShowTime)) / 100));
    playtimeSeekBar.setProgress((((int) (playerPos)) / 100));
}