@java.lang.Override
public java.util.List<io.crate.analyze.symbol.Field> describe() {
    if ((analysis.rootRelation()) == null) {
        return null;
    }
    return analysis.rootRelation().fields();
}