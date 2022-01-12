@java.lang.Override
public com.labsynch.cmpdreg.chemclasses.jchem.CmpdRegMoleculeJChemImpl readNextMol() throws java.io.IOException {
    chemaxon.struc.Molecule mol = this.molImporter.read();
    if (mol == null)
        return null;
    
    com.labsynch.cmpdreg.chemclasses.jchem.CmpdRegMoleculeJChemImpl molecule = new com.labsynch.cmpdreg.chemclasses.jchem.CmpdRegMoleculeJChemImpl(mol);
    return molecule;
}