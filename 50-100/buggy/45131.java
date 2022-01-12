public static com.cdd.bao.template.Schema.Assignment linearBranch(com.cdd.bao.template.Schema.Assignment assn) {
    com.cdd.bao.template.Schema.Group par = assn.parent;
    com.cdd.bao.template.Schema.Group dup = new com.cdd.bao.template.Schema.Group(null, par.name, par.groupURI);
    dup.descr = par.descr;
    dup.assignments.add(assn);
    assn = assn.clone(dup);
    while ((par.parent) != null) {
        dup.parent = new com.cdd.bao.template.Schema.Group(null, par.parent.name, par.parent.groupURI);
        dup.parent.descr = par.parent.descr;
        dup.parent.subGroups.add(dup);
        par = par.parent;
        dup = par.parent;
    } 
    return assn;
}