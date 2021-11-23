public final blue.nez.parser.Parser newParser(java.lang.String name) {
    return new blue.nez.parser.Parser(this.getProduction(name), new blue.origami.util.OOption());
}