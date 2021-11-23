public final gw.internal.gosu.parser.Token getCurrentToken() {
    gw.util.Stack<gw.internal.gosu.parser.Token> tokens = _internal.getTokens();
    int count = tokens.size();
    if (count == 0) {
        return new gw.internal.gosu.parser.Token();
    }
    if ((_state) == count) {
        return _internal.getEofToken();
    }
    if ((_state) == (-1)) {
        return new gw.internal.gosu.parser.Token();
    }
    return tokens.get(_state);
}