public static org.biojava.nbio.structure.Atom[] cyclicSorter(org.biojava.nbio.structure.Structure structure) {
    java.util.List<org.biojava.nbio.structure.Atom[]> chainAtoms = new java.util.ArrayList<org.biojava.nbio.structure.Atom[]>();
    for (org.biojava.nbio.structure.Chain c : structure.getChains()) {
        org.biojava.nbio.structure.Atom[] atoms = org.biojava.nbio.structure.StructureTools.getRepresentativeAtomArray(c);
        if ((atoms.length) > 0)
            chainAtoms.add(atoms);
        
    }
    return org.biojava.nbio.structure.align.symm.ChainSorter.cyclicSorter(chainAtoms);
}