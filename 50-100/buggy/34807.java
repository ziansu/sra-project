public boolean add(java.lang.String identifier, parser.Kinds kind, java.lang.String type) {
    boolean answer = false;
    if (!(identifierTable.containsKey(identifier))) {
        parser.Symbol symbol = new parser.Symbol(identifier, kind, type);
        identifierTable.put(identifier, symbol);
        answer = true;
    }
    return answer;
}