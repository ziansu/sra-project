@java.lang.Override
public java.lang.String read() throws java.lang.Exception {
    if ((termsIt) == null) {
        termsIt = aggregator.getCoTerms().keySet().iterator();
    }
    if (termsIt.hasNext()) {
        return termsIt.next();
    }
    return null;
}