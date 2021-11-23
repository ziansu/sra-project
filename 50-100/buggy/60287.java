public void setWordLength(int length) {
    int check = this.words.get(0).length();
    for (java.lang.String word : this.words) {
        if ((word.length()) == length) {
            check = length;
            break;
        }
    }
    this.length = check;
}