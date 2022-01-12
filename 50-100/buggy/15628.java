@java.lang.Override
public java.lang.String toString() {
    if (terms.isEmpty()) {
        return symbol.getSymbol();
    }
    final java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
    at.ac.tuwien.kr.alpha.Util.appendDelimited(sb, terms);
    sb.append(")");
    return sb.toString();
}