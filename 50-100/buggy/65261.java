public java.lang.String getName() {
    java.util.List list = getPieces();
    java.lang.Object last = list.get(((list.size()) - 1));
    if (last instanceof com.brweber2.ast.Symbol) {
        return ((com.brweber2.ast.Symbol) (last)).symbol;
    }
    return null;
}