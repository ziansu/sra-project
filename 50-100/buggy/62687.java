@java.lang.Override
protected void onComplete() {
    for (int i = 0; i < (resolverContainer.attributes.size()); i++) {
        java.lang.String attribute = resolverContainer.attributes.get(i);
        result.put(attribute, ((java.lang.Object[]) (attributesPlaceholder[0]))[i]);
    }
    callback.setComplete();
}