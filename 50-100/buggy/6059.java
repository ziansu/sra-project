public void deleteLetter() {
    wordsandlearn.ua.wordsandlearn.LetterObject removeLetter = mWord.get(((mWordLength) - 1));
    this.removeView(findViewById(removeLetter.getId()));
    mWord.remove(((mWordLength) - 1));
    setWordLength();
}