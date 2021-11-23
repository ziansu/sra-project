public boolean containsProperty(java.lang.String property) {
    initialize();
    com.geewhiz.pacify.property.resolver.araresolver.model.AraData.Variable variable = getVariable(property);
    return (variable.getValue()) != null;
}