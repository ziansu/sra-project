@java.lang.Override
public boolean searchWord(java.lang.String word) {
    if (this.verifyPassword()) {
        for (int index = 0; index < (pages.length); index++) {
            if (this.pages[(index - 1)].searchWord(word)) {
                return true;
            }
        }
    }
    return false;
}