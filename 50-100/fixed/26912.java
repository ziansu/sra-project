public Relation rename(java.util.ArrayList<java.lang.String> cnames) {
    Relation rel = new Relation(this.name, cnames, this.domains);
    for (int i = 0; i < (this.table.size()); i++) {
        rel.addTuple(this.table.get(i).clone(cnames));
    }
    return rel;
}