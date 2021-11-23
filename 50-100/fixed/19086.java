public void removeTerm(final org.eclipselabs.e4.tapiji.translator.model.Term elem) {
    synchronized(terms) {
        for (final org.eclipselabs.e4.tapiji.translator.model.Term term : terms) {
            if (term.equals(elem)) {
                terms.remove(term);
                break;
            }
            if (term.removeTerm(elem)) {
                break;
            }
        }
    }
}