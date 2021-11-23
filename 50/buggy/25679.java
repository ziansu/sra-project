public void runReconstruction() throws java.lang.Exception {
    java.lang.System.out.println(inferenceType);
    if (inferenceType.equalsIgnoreCase("marginal"))
        runReconstructionMarginal();
    else
        if ((asrJoint) == null)
            runReconstructionJoint();
        
    
}