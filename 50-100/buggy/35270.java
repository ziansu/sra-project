@java.lang.Override
public boolean equals(java.lang.Object o) {
    boolean equals = false;
    if (o instanceof Word) {
        Word otherWord = ((Word) (o));
        if (((this.getName().equals(otherWord.getName())) & (this.getMeaning().equals(otherWord.getMeaning()))) & (java.util.Arrays.equals(this.getExample(), otherWord.getExample()))) {
            equals = true;
        }
    }
    return equals;
}