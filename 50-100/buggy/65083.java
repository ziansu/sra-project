private de.bioforscher.chemistry.parser.pdb.structures.tokens.LeafSkeleton createLeafSkeleton() {
    de.bioforscher.chemistry.parser.pdb.structures.tokens.LeafSkeleton.AssignedFamily assignedFamily = null;
    de.bioforscher.chemistry.physical.model.StructuralFamily structuralFamily = null;
    if (isNucleotide()) {
        if (!(this.parent.equals("?"))) {
            assignedFamily = LeafSkeleton.AssignedFamily.MODIFIED_NUCLEOTIDE;
        }
    }else
        if (isAminoAcid()) {
            assignedFamily = LeafSkeleton.AssignedFamily.MODIFIED_AMINO_ACID;
        }else {
            assignedFamily = LeafSkeleton.AssignedFamily.LIGAND;
        }
    
    return new de.bioforscher.chemistry.parser.pdb.structures.tokens.LeafSkeleton(this.threeLetterCode, this.parent, assignedFamily, this.bonds);
}