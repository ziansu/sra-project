public org.jenkinsci.plugins.chroot.tools.ChrootToolset forNode(hudson.model.Node node, hudson.model.TaskListener listener) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.String home = translateFor(node, listener);
    if (com.google.common.base.Strings.isNullOrEmpty(home)) {
        throw new java.io.IOException(((("The node " + (node.getDisplayName())) + " is not correctly setup up for ") + (this.getToolName())));
    }
    return new org.jenkinsci.plugins.chroot.tools.ChrootToolset(getName(), home, getToolName(), getProperties().toList());
}