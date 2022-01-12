private java.util.LinkedList<de.hsnr.inr.sir.dictionary.Posting> processTupleQueryTermList(java.util.LinkedList<de.hsnr.inr.sir.query.QueryTerm> qtl) {
    de.hsnr.inr.sir.query.QueryTerm qt0 = qtl.get(0);
    de.hsnr.inr.sir.query.QueryTerm qt1 = qtl.get(1);
    getPostingList(qt0);
    getPostingList(qt1);
    return decideAndCallAndMethod(qt0, qt1);
}