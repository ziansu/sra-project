private org.biojava.nbio.structure.Group getGroupWithSameResNumButDiffPDBName() {
    for (org.biojava.nbio.structure.Group g : chain.getAtomGroups()) {
        if (g.getResidueNumber().equals(group.getResidueNumber())) {
            if (!(g.getPDBName().equals(group.getPDBName()))) {
                return g;
            }
        }
    }
    return null;
}