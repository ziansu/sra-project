public static java.util.List<org.mockserver.model.NottableString> strings(java.util.Collection<java.lang.String> values) {
    java.util.List<org.mockserver.model.NottableString> nottableValues = new java.util.ArrayList<org.mockserver.model.NottableString>();
    for (java.lang.String value : values) {
        nottableValues.add(org.mockserver.model.NottableString.string(value));
    }
    return nottableValues;
}