@java.lang.Override
public com.labsynch.cmpdreg.chemclasses.jchem.CmpdRegMoleculeJChemImpl readNextMol() throws java.io.IOException {
    chemaxon.struc.Molecule mol = this.molImporter.read();
    com.labsynch.cmpdreg.chemclasses.jchem.CmpdRegMoleculeJChemImpl molecule = new com.labsynch.cmpdreg.chemclasses.jchem.CmpdRegMoleculeJChemImpl(mol);
    return molecule;
}