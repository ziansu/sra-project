double getRE(java.lang.String word) {
    if ((word.length()) > (evaluate.config.maxStringLength))
        word = word.substring(((word.length()) - (evaluate.config.maxStringLength)), word.length());
    
    dataProcess.WordInfoInCorpus.WordInfo tmp = wordInfo.getValueForExactKey(word);
    if (tmp == null)
        return 0;
    
    return tmp.re;
}