public java.util.ArrayList<mx.evin.apps.words.model.entities.parse.Term> magicFilter() {
    quickFilter();
    if ((results.size()) < 0)
        firstLettersFilter(3);
    
    if ((results.size()) < 0)
        wordByWordFilter();
    
    if ((results.size()) < 0)
        firstLettersFilter(2);
    
    if ((results.size()) < 0)
        firstLettersFilter(1);
    
    return results;
}