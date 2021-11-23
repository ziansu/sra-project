private double tf(java.lang.String term, java.lang.String docName) {
    double fik;
    if ((InvertedIndex.invertedIndex.get(term).containsKey(docName)) == false) {
        return 0;
    }else
        if ((BackData.wordFreqDoc.get(docName)) == 0) {
            return 0;
        }else {
            fik = InvertedIndex.invertedIndex.get(term).get(docName);
        }
    
    return fik / (BackData.wordFreqDoc.get(docName));
}