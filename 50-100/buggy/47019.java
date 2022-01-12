public java.util.Map<java.lang.Character, java.lang.Double> getCharacterDistribution(int id) {
    graph.setCurrent(id);
    java.util.Map<java.lang.Character, java.lang.Double> dist = graph.getCharacterDistribution();
    return dist == null ? null : new java.util.HashMap(graph.getCharacterDistribution());
}