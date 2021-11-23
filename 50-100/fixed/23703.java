public void addTerm(final org.eclipselabs.e4.tapiji.translator.model.Term parentTerm, final org.eclipselabs.e4.tapiji.translator.model.Term newTerm) {
    synchronized(terms) {
        if (parentTerm == null) {
            this.terms.add(newTerm);
            return ;
        }
        for (final org.eclipselabs.e4.tapiji.translator.model.Term term : terms) {
            if (term.equals(parentTerm)) {
                term.subTerms.add(newTerm);
                break;
            }
            if (term.addTerm(parentTerm, newTerm)) {
                break;
            }
        }
    }
}