public userfeedback.BoostableQuery find(userfeedback.BoostableQuery term, java.util.Vector<userfeedback.BoostableQuery> terms) {
    userfeedback.BoostableQuery termF = null;
    java.util.Iterator<userfeedback.BoostableQuery> iterator = terms.iterator();
    while (iterator.hasNext()) {
        userfeedback.BoostableQuery currentTerm = iterator.next();
        if (term.getTerm().equals(currentTerm.getTerm())) {
            termF = currentTerm;
        }
    } 
    return termF;
}