private int relevance(se.kth.krijor.Document doc1, se.kth.krijor.Document doc2) {
    int diff = wrd.getRelevance(doc1).compareTo(wrd.getRelevance(doc2));
    diff = (asc) ? diff : -diff;
    if (diff > 0)
        return 1;
    else
        if (diff < 0)
            return -1;
        else
            return 0;
        
    
}