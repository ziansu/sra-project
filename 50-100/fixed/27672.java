public java.util.Map<java.lang.Integer, edu.rutgers.MOST.data.SBMLReaction> createCompartmentIdReactionMap(java.util.Vector<edu.rutgers.MOST.data.SBMLReaction> rxns) {
    java.util.Map<java.lang.Integer, edu.rutgers.MOST.data.SBMLReaction> idReactionMap = new java.util.HashMap<java.lang.Integer, edu.rutgers.MOST.data.SBMLReaction>();
    for (int i = 0; i < (rxns.size()); i++) {
        idReactionMap.put(rxns.get(i).getId(), rxns.get(i));
    }
    return idReactionMap;
}