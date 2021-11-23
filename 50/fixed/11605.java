public java.util.Map<java.lang.Integer, java.lang.Character> getSeqChars(int id) {
    if (!(graph.setCurrent(id)))
        return null;
    
    return new java.util.HashMap(graph.getSequenceCharacterMapping());
}