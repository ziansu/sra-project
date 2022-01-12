@java.lang.Override
public boolean searchWord(java.lang.String word) {
    for (int index = 0; index < (pages.length); index++) {
        if (this.pages[(index - 1)].searchWord(word)) {
            return true;
        }
    }
    return false;
}