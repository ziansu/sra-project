@java.lang.Override
public boolean isChunkEnd(@javax.annotation.Nonnull
org.jenkinsci.plugins.workflow.graph.FlowNode current, @javax.annotation.CheckForNull
org.jenkinsci.plugins.workflow.graph.FlowNode previous) {
    if (previous == null) {
        return false;
    }
    if (current instanceof org.jenkinsci.plugins.workflow.graph.BlockEndNode) {
        org.jenkinsci.plugins.workflow.graph.BlockStartNode bsn = ((org.jenkinsci.plugins.workflow.graph.BlockEndNode) (previous)).getStartNode();
        if (isChunkStart(bsn, null)) {
            return true;
        }
    }
    return isChunkStart(previous, null);
}