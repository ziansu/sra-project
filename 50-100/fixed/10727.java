public static de.hsnr.inr.sir.query.QueryItem create(java.lang.String name) {
    try {
        return de.hsnr.inr.sir.query.QueryConjunction.create(name);
    } catch (java.lang.IllegalArgumentException e) {
    }
    try {
        return de.hsnr.inr.sir.query.ProximityQuery.create(name);
    } catch (java.lang.IllegalArgumentException e) {
    }
    try {
        return de.hsnr.inr.sir.query.PhraseQuery.create(name);
    } catch (java.lang.IllegalArgumentException e) {
    }
    return de.hsnr.inr.sir.query.ConcreteQueryTerm.create(name);
}