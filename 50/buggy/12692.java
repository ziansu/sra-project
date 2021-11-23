public boolean hasWord(java.lang.String word) {
    return word.toLowerCase().matches(this.regExPattern);
}