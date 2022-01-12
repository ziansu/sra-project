@java.lang.SuppressWarnings(value = "unchecked")
protected static org.springframework.util.CompositeIterator createInParameterIterator(java.lang.Object value) {
    java.util.Iterator it;
    if (value instanceof java.lang.String) {
        java.lang.String[] tokens = org.apache.camel.util.StringQuoteHelper.splitSafeQuote(((java.lang.String) (value)), ',', true);
        java.util.List<java.lang.String> list = java.util.Arrays.asList(tokens);
        it = list.iterator();
    }else {
        it = org.apache.camel.util.ObjectHelper.createIterator(value, null);
    }
    org.springframework.util.CompositeIterator ci = new org.springframework.util.CompositeIterator();
    ci.add(it);
    return ci;
}