public java.lang.String transform(java.lang.String term) {
    if ((term == null) || ((term.length()) == 0))
        return term;
    
    java.lang.String transformedTerm = term;
    if (isMultiTerm(transformedTerm)) {
        transformedTerm = transform(transformedTerm.split("\\p{Space}"));
    }else {
        for (ctrus.pa.bow.term.TermTransformer transformer : _transfomers) {
            if ((transformer.isEnabled()) && (transformedTerm != null)) {
                transformedTerm = transformer.transform(transformedTerm);
            }
        }
    }
    return transformedTerm;
}