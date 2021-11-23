public java.util.Map<java.lang.Character, java.lang.Double> getCharacterDistribution(int id) {
    if (!(graph.setCurrent(id)))
        return null;
    
    java.util.Map<java.lang.Character, java.lang.Double> dist = graph.getCharacterDistribution();
    return dist == null ? null : new java.util.HashMap(graph.getCharacterDistribution());
}