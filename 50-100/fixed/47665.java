private void stopPlayService() {
    if (((getPlayerService().getPlayer()) != null) && (getPlayerService().getPlayer().isPlaying())) {
        getPlayerService().getPlayer().stopPlayback();
        com.iyuba.music.entity.article.StudyRecordUtil.recordStop(com.iyuba.music.manager.StudyManager.getInstance().getLesson(), 0);
    }
    stopService(playServiceIntent);
}