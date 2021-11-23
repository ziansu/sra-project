private void runReconstructionJoint() throws java.lang.Exception {
    asrJoint = new reconstruction.ASRPOG(alnFilepath, treeFilepath, true, false);
    asrJoint.saveTree((((sessionDir) + (label)) + "_recon.nwk"));
}