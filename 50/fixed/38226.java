public boolean isMatch() {
    if (this.wordList.contains(this.getSelection())) {
        this.wordsFound.add(this.wordList.remove());
        return true;
    }else {
        return false;
    }
}