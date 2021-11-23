public void setWordLength(int length) {
    int check = this.words.get(0).length();
    for (java.lang.String word : this.words) {
        if ((word.length()) == length) {
            check = length;
            break;
        }else
            if (check > (word.length())) {
                check = word.length();
            }
        
    }
    this.length = check;
}