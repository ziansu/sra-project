public hudson.plugins.ec2.SlaveTemplate getTemplate(hudson.model.Label label) {
    for (hudson.plugins.ec2.SlaveTemplate t : templates)
        if ((label == null) || (label.matches(t.getLabelSet())))
            return t;
        
    
    return null;
}