public java.lang.String keywordCipher(java.lang.Boolean b) {
    if (b == true) {
        java.lang.String keyword = n.getText().toString();
        java.lang.String letter = in3.getText().toString();
        int letterIndex = getIndex2(letter);
        if (letterIndex >= 0) {
            char[] finishedAlphabet = com.example.lrb13.cipher.MainActivity.setUpAlphabet(keyword, letterIndex);
            java.lang.String output = getOutput(input, finishedAlphabet);
            return output;
        }else
            return "";
        
    }else {
        return "";
    }
}