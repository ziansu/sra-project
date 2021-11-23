private void playMusics(java.util.List<com.changhong.touying.music.Music> musics, com.changhong.touying.music.Music music) {
    if ((player) == null)
        return ;
    
    if (music != null) {
        player.playMusics(music);
    }else {
        player.autoPlaying(true);
    }
}