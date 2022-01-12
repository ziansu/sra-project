public blue.nez.parser.Parser newParser(blue.origami.util.OOption options) {
    java.lang.String start = options.value(ParserOption.Start, null);
    if (start == null) {
        return new blue.nez.parser.Parser(this.getStartProduction(), options);
    }
    return new blue.nez.parser.Parser(this.getProduction(start), options);
}