public void markCurrentSong() {
    player.markCurrentSong(DoubanAPI.OP_MARK_AS_LIKE);
    mine.android.api.ContextAPI.makeToast("已标记为喜欢");
}