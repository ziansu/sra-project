@java.lang.Override
protected void doSetValue(java.lang.Object newValue) {
    if ((suggestionConverter) != null) {
        if (newValue == null) {
            getRpcProxy(org.vaadin.suggestfield.client.SuggestFieldClientRpc.class).clearValueImmediate();
        }else {
            getState().fieldSuggestion = suggestionConverter.toSuggestion(newValue);
        }
        getState().value = newValue;
    }
}