public boolean setGraduationTerm(java.lang.String theTerm) {
    for (java.lang.String term : model.StudentDegree.TERMSET) {
        if (term.equalsIgnoreCase(theTerm)) {
            myTerm = term;
            return true;
        }
    }
    return false;
}