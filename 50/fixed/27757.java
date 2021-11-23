private java.util.List<io.crate.analyze.symbol.Field> fields() {
    if ((analysis.rootRelation()) == null) {
        return null;
    }
    return analysis.rootRelation().fields();
}