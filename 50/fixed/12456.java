public void saveConsensusJoint(java.lang.String filepath, java.lang.String label) throws java.io.IOException {
    if ((asrJoint) != null)
        if (label == null)
            asrJoint.saveSupportedAncestors(filepath);
        else
            asrJoint.saveSupportedAncestor(filepath, label);
        
    
}