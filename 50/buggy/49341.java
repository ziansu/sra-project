public static void playNext(android.content.Context context, teamfmg.hangman.MusicPlayer.MusicType type) {
    teamfmg.hangman.MusicPlayer.mp = android.media.MediaPlayer.create(context, R.raw.intro);
    teamfmg.hangman.MusicPlayer.mp.start();
}