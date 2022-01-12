public java.lang.String transform(java.lang.String term) {
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