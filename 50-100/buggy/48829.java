@java.lang.Override
public java.lang.String read() throws java.lang.Exception {
    com.google.common.base.Preconditions.checkArgument(((aggregator) != null), "CoTermsAggregator instance is null");
    if ((termsIt) == null) {
        termsIt = aggregator.getCoTerms().keySet().iterator();
    }
    if (termsIt.hasNext()) {
        return termsIt.next();
    }
    return null;
}