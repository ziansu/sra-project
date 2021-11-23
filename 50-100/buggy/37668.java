private void setWordByCategory() {
    cat = getIntent().getIntExtra(aditi.hangman.Game.KEY_CATEGORY, aditi.hangman.Game.CATEGORY_ADJECTIVES);
    if ((cat) == (aditi.hangman.Game.CATEGORY_CONTINUE)) {
        android.content.SharedPreferences res = getPreferences(aditi.hangman.MODE_PRIVATE);
        java.util.Map finalt = res.getAll();
        mysteryWord = getPreferences(aditi.hangman.MODE_PRIVATE).getString(aditi.hangman.Game.PREF_MYSTERYWORD, getWord(aditi.hangman.Game.CATEGORY_ADJECTIVES));
        return ;
    }
    mysteryWord = getWord(cat);
}