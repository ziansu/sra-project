public static void stop(android.content.Context context) {
    if ((aditi.hangman.Music.mp) != null) {
        aditi.hangman.Music.mp.stop();
        aditi.hangman.Music.mp.release();
        aditi.hangman.Music.mp = null;
    }
}