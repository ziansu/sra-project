private void runReconstructionMarginal() throws java.lang.Exception {
    if (((nodeLabel) != null) && (nodeLabel.equalsIgnoreCase("root")))
        nodeLabel = null;
    
    if ((nodeLabel) != null)
        asrMarginal = new reconstruction.ASRPOG(null, treeFilepath, alnFilepath, nodeLabel, true);
    else
        asrMarginal = new reconstruction.ASRPOG(alnFilepath, treeFilepath, false, true);
    
    asrMarginal.saveTree((((sessionDir) + (label)) + "_recon.nwk"));
}