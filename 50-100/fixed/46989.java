protected int countWords(java.lang.String str) {
    if ((str != null) && (str != "")) {
        str = this.removeExtraSpace(str);
        if ((str.charAt(0)) != ' ') {
            numberOfWords = 1;
            numberOfWords += (str.length()) - (str.replaceAll(" ", "").length());
        }else {
            numberOfWords = 0;
        }
        return numberOfWords;
    }else {
        numberOfWords = 0;
        return numberOfWords;
    }
}