public hudson.util.FormValidation doCheckSignPartitionSize(@org.kohsuke.stapler.AncestorInPath
hudson.model.AbstractProject project, @org.kohsuke.stapler.QueryParameter
java.lang.String value) throws java.io.IOException {
    try {
        int partitionSize = java.lang.Integer.parseInt(value);
        if (partitionSize > 0)
            return hudson.util.FormValidation.ok();
        else
            return hudson.util.FormValidation.error(jenkins.plugins.rpmsign.Messages.signPartitionSize_incorrectValue());
        
    } catch (java.lang.NumberFormatException e) {
        return hudson.util.FormValidation.error(jenkins.plugins.rpmsign.Messages.signPartitionSize_notNumber());
    }
}