public java.lang.String nextSentence(java.lang.String text) {
    try {
        java.lang.String sentence = "";
        int i = 0;
        while ((text.charAt(i)) != '\n') {
            sentence += text.charAt(i);
            i++;
        } 
        return sentence;
    } catch (java.lang.ArrayIndexOutOfBoundsException eA) {
    }
    return "";
}