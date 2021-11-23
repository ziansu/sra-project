private static boolean isPosOutOfBound(int position) {
    return ((position < 0) || ((com.andy.music.utility.MusicLocator.currentMusicList) == null)) || (position > ((com.andy.music.utility.MusicLocator.currentMusicList.size()) - 1));
}