public void runReconstruction() throws java.lang.Exception {
    if (inferenceType.equalsIgnoreCase("marginal"))
        runReconstructionMarginal();
    else
        if ((asrJoint) == null)
            runReconstructionJoint();
        
    
}