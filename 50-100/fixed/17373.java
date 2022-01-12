@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj) {
        return true;
    }
    if (obj == null) {
        return false;
    }
    if (!(obj instanceof edu.harvard.iq.datatags.model.graphs.nodes.SetNode)) {
        return false;
    }
    final edu.harvard.iq.datatags.model.graphs.nodes.SetNode other = ((edu.harvard.iq.datatags.model.graphs.nodes.SetNode) (obj));
    return (java.util.Objects.equals(this.tags, other.tags)) && (equalsAsNode(other));
}