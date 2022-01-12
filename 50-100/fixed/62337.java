public java.lang.String explain(org.prop4j.Node[] clauses, org.prop4j.Literal deadF, boolean cond) {
    conditional = cond;
    reason = "";
    if ((!(set(deadF, false, clauses))) || (!(BCP(clauses)))) {
        return reason;
    }
    return reason;
}