public org.kohsuke.stapler.framework.adjunct.AdjunctManager getAdjuncts(java.lang.String dummy) {
    return jenkins.model.Jenkins.getInstance().getAdjuncts(dummy);
}