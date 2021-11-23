public Relation rename(java.util.ArrayList<java.lang.String> cnames) {
    java.util.ArrayList<java.lang.String> newAttr = new java.util.ArrayList<java.lang.String>();
    java.util.ArrayList<java.lang.String> newDom = new java.util.ArrayList<java.lang.String>();
    newAttr = cnames;
    newDom = this.domains;
    Relation rel = new Relation(this.name, newAttr, newDom);
    for (Tuple t : this.table) {
        rel.addTuple(t.clone(newAttr));
    }
    return rel;
}