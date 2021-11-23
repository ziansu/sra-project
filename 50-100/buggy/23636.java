public void setRandomWord() {
    java.lang.String words = getResources().getString(R.string.words);
    java.lang.String[] arrayWords = words.split(" ");
    android.util.Log.d(edu.android.petrov.hangman.GameActivity.TAG_GAME, ("words count = " + (arrayWords.length)));
    hiddenWord = arrayWords[random.nextInt(((arrayWords.length) - 1))];
}