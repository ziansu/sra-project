public java.util.List<ca.appvelopers.mcgillmobile.model.Term> getTerms() {
    if ((registerTerms) == null) {
        registerTerms = new java.util.ArrayList<>();
        java.lang.String[] termsStrings = get().split(",");
        for (java.lang.String term : termsStrings) {
            registerTerms.add(ca.appvelopers.mcgillmobile.model.Term.parseTerm(term));
        }
    }
    return registerTerms;
}