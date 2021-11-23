boolean compare(final homeWork1.Lab1.node top1, final homeWork1.Lab1.node top2) {
    homeWork1.Lab1.node p = top1.link;
    homeWork1.Lab1.node q = top2.link;
    while ((p != null) && (q != null)) {
        if (!(((p.exp) == (q.exp)) && (p.var.equals(q.var)))) {
            return false;
        }
        p = p.link;
        q = q.link;
    } 
    return p == q;
}