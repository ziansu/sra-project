public final boolean isNumeric(java.lang.String word) {
    if (this.inDictionary(word)) {
        return false;
    }else {
        return word.matches("^[+-]{0,1}\\d{1,3}(?:[,]\\d{3})*(?:[.]\\d*)*$");
    }
}