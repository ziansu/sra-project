private void runReconstructionMarginal() throws java.lang.Exception {
    if (((nodeLabel) != null) && (!(nodeLabel.equalsIgnoreCase("root"))))
        asrMarginal = new reconstruction.ASRPOG(null, treeFilepath, alnFilepath, nodeLabel, false);
    else
        asrMarginal = new reconstruction.ASRPOG(alnFilepath, treeFilepath, false, false);
    
    asrMarginal.saveTree((((sessionDir) + (label)) + "_recon.nwk"));
}