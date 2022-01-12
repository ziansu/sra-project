public synchronized void newChar(char c) {
    ngram.putChar(c);
    java.lang.String s = ngram.getString();
    if (s != null) {
        java.lang.Integer currentNumber = numberOfNgrams.get(s);
        if (currentNumber == null) {
            currentNumber = 1;
        }else {
            currentNumber++;
        }
        numberOfNgrams.put(s, currentNumber);
    }
}