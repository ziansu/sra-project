public static void play(android.content.Context context, int resource) {
    aditi.hangman.Music.stop(context);
    aditi.hangman.Music.mp = android.media.MediaPlayer.create(context, resource);
    aditi.hangman.Music.mp.start();
}