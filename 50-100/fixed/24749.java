public void resetDisplay() throws org.biojava.nbio.structure.align.model.StructureAlignmentException {
    if ((multAln) != null) {
        java.lang.String script = org.biojava.nbio.structure.align.gui.jmol.MultipleAlignmentJmol.getJmolString(multAln, atomArrays, colors);
        evalString(script);
        jmolPanel.evalString("save STATE state_1");
        jmolPanel.evalString("hide ligand");
    }
}