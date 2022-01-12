private void runReconstructionMarginal() throws java.lang.Exception {
    if (((nodeLabel) != null) && (!(nodeLabel.equalsIgnoreCase("root"))))
        asrMarginal = new reconstruction.ASRPOG(null, treeFilepath, alnFilepath, nodeLabel);
    else
        asrMarginal = new reconstruction.ASRPOG(alnFilepath, treeFilepath, false);
    
    asrMarginal.saveTree((((sessionDir) + (label)) + "_recon.nwk"));
}