public java.util.ArrayList<mx.evin.apps.words.model.entities.parse.Term> magicFilter() {
    quickFilter();
    if ((results.size()) < 1)
        firstLettersFilter(3);
    
    if ((results.size()) < 1)
        wordByWordFilter();
    
    if ((results.size()) < 1)
        firstLettersFilter(2);
    
    if ((results.size()) < 1)
        firstLettersFilter(1);
    
    return results;
}