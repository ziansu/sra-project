public java.util.Map<java.lang.Integer, java.lang.Character> getSeqChars(int id) {
    graph.setCurrent(id);
    return new java.util.HashMap(graph.getSequenceCharacterMapping());
}