public void play() {
    if ((!(queue.isEmpty())) && ((playing) == false)) {
        playing = true;
        model.Song s = queue.getElementAt(0);
        songplayer.SongPlayer.playFile(new model.Jukebox.SongWaiter(), ((model.Jukebox.baseDir) + (s.getFileName())));
    }
    return ;
}