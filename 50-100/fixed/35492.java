public eu.arrowhead.ArrowheadConsumer.model.ServiceRequestForm.Builder orchestrationFlags(java.util.Map<java.lang.String, java.lang.Boolean> flags) {
    for (java.lang.String key : eu.arrowhead.ArrowheadConsumer.model.ServiceRequestForm.flagKeys) {
        if (!(flags.containsKey(key))) {
            flags.put(key, false);
        }
    }
    orchestrationFlags = flags;
    return this;
}