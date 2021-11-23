private boolean tryParse(dyvil.tools.parsing.marker.MarkerList markers, dyvil.tools.parsing.TokenIterator tokens, dyvil.tools.parsing.Parser parser, boolean reportErrors) {
    markers.clear();
    this.parser.reset(markers, tokens);
    this.parser.resetTo(tokens.first());
    return this.parser.parse(parser, reportErrors);
}