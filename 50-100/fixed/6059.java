public void deleteLetter() {
    mWordLength = mWord.size();
    if ((mWordLength) >= 1) {
        this.removeView(findViewById(mWord.get(((mWordLength) - 1)).getId()));
        mWord.remove(((mWordLength) - 1));
        mWordLength -= 1;
    }
}