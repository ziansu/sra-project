public synchronized void newChar(char c) {
    ngram.putChar(c);
    java.lang.String s = ngram.getString();
    if (s != null) {
        java.lang.Long currentNumber = numberOfNgrams.get(s);
        if (currentNumber == null) {
            currentNumber = 1L;
        }else {
            currentNumber++;
        }
        numberOfNgrams.put(s, currentNumber);
    }
}