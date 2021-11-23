@java.lang.Override
public int getFrequency(java.lang.String word, java.lang.String classification) {
    java.lang.Integer count = this.frequencies.get(classification).get(word);
    return count != null ? count : 0;
}