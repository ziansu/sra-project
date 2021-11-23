private org.biojava.nbio.structure.Group getGroupWithSameResNumButDiffPDBName() {
    for (org.biojava.nbio.structure.Group g : chain.getAtomGroups()) {
        if ((g.getResidueNumber().getSeqNum()) == (group.getResidueNumber().getSeqNum())) {
            if (!(g.getPDBName().equals(group.getPDBName()))) {
                return g;
            }
        }
    }
    return null;
}