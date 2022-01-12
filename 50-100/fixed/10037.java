public final nez.util.UList<nez.expr.Expression> toList() {
    nez.util.UList<nez.expr.Expression> l = new nez.util.UList<nez.expr.Expression>(new nez.expr.Expression[this.size()]);
    if ((this.size()) > 1) {
        for (nez.expr.Expression e : this) {
            l.add(e);
        }
    }else {
        l.add(this);
    }
    return l;
}