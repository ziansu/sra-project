private boolean isUseNewQueryInterpreter(com.evolveum.midpoint.prism.query.ObjectQuery query) {
    return (query == null) || (query.isUseNewQueryInterpreter());
}