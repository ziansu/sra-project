public final T parse(org.codehaus.jparsec.Token[] tokens) {
    org.codehaus.jparsec.ParserState state = new org.codehaus.jparsec.ParserState(null, null, tokens, 0, null, 0, tokens, new org.codehaus.jparsec.parameters.Parameters());
    if (!(apply(state))) {
        throw new org.codehaus.jparsec.error.ParserException(state.renderError(), new org.codehaus.jparsec.error.Location(1, 1));
    }
    return getReturn(state);
}