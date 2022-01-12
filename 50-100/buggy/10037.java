public final nez.util.UList<nez.expr.Expression> toList() {
    nez.util.UList<nez.expr.Expression> l = new nez.util.UList<nez.expr.Expression>(new nez.expr.Expression[this.size()]);
    for (nez.expr.Expression e : this) {
        l.add(e);
    }
    return l;
}