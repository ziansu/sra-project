public <T> com.nulldreams.adapter.DataChange addAll(java.util.Collection<T> data, com.nulldreams.adapter.DelegateParser<T> parser) {
    java.util.List<com.nulldreams.adapter.impl.LayoutImpl> delegates = generateDelegateImpls(data, parser);
    if (delegates != null) {
        addAll(delegates);
    }
    return com.nulldreams.adapter.DataChange.doNothingInstance();
}