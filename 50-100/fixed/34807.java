public boolean add(java.lang.String identifier, parser.Kinds kind, java.lang.String type, java.lang.Integer start, java.lang.Integer end) {
    boolean answer = false;
    if (!(identifierTable.containsKey(identifier))) {
        parser.Symbol symbol = new parser.Symbol(identifier, kind, type, start, end);
        identifierTable.put(identifier, symbol);
        answer = true;
    }
    return answer;
}