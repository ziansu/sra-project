public void play(boolean loop) {
    if ((movieseek) != null) {
        movieseek.loop = loop;
        movieseek.restart = true;
        movieseek.interrupt();
    }else {
        movieseek = new bms.player.beatoraja.play.bga.FFmpegProcessor.MovieSeekThread();
        movieseek.loop = loop;
        movieseek.start();
    }
}