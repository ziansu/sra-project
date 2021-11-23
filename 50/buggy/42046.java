@java.lang.Override
public int compareTo(java.lang.Object obj) {
    Word other = ((Word) (obj));
    if (equals(other)) {
        return 0;
    }
    int wordCmp = mWord.compareTo(other.mWord);
    return wordCmp;
}