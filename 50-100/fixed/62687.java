@java.lang.Override
protected void onComplete() {
    for (int i = 0; i < (resolverContainer.attributes.size()); i++) {
        java.lang.String attribute = resolverContainer.attributes.get(i);
        result.put(attribute, ((attributesPlaceholder[0]) != null ? ((java.lang.Object[]) (attributesPlaceholder[0]))[i] : null));
    }
    callback.setComplete();
}