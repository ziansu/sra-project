public static void main(java.lang.String[] args) {
    try {
        org.biojava.nbio.structure.Structure bioAssembly = org.biojava.nbio.structure.StructureIO.getBiologicalAssembly("1pdr", 1);
        org.biojava.nbio.structure.align.gui.jmol.StructureAlignmentJmol jmolPanel = new org.biojava.nbio.structure.align.gui.jmol.StructureAlignmentJmol();
        jmolPanel.setStructure(bioAssembly);
        jmolPanel.evalString("select * ; color structure ; spacefill off; wireframe off; backbone off; cartoon on; select ligands ; spacefill 0.4; color cpk; model 0;");
        java.lang.System.out.println("done!");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}