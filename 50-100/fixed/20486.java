public java.util.Map<java.lang.String, java.lang.String> getArgumentTidsWithNames() {
    java.util.Map<java.lang.String, java.lang.String> argumentsWithNames = new java.util.LinkedHashMap<>();
    if (((getArguments()) != null) && ((getArguments().size()) > 0)) {
        for (edu.brandeis.cs.nlp.mae.model.Argument argument : getArguments()) {
            argumentsWithNames.put(argument.getName(), argument.getArgument().getTid());
        }
    }
    return argumentsWithNames;
}