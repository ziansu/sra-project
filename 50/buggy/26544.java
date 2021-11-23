private void runReconstructionJoint() throws java.lang.Exception {
    java.lang.System.out.println(nodeLabel);
    asrJoint = new reconstruction.ASRPOG(alnFilepath, treeFilepath, true, true);
    asrJoint.saveTree((((sessionDir) + (label)) + "_recon.nwk"));
}