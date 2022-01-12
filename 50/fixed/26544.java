private void runReconstructionJoint() throws java.lang.Exception {
    asrJoint = new reconstruction.ASRPOG(alnFilepath, treeFilepath, true);
    asrJoint.saveTree((((sessionDir) + (label)) + "_recon.nwk"));
}