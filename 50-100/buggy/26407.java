@java.lang.Override
public org.nodes.DNode<java.lang.String> add(java.lang.String label) {
    if ((!(nullLabels)) && (label != null))
        throw new java.lang.IllegalArgumentException("Graph is set to null labels only.");
    
    if (!(nullLabels))
        labels.add(label);
    
    in.add(new java.util.ArrayList<java.lang.Integer>(2));
    out.add(new java.util.ArrayList<java.lang.Integer>(2));
    sorted = false;
    return new org.nodes.DiskDGraph.DiskDNode(((in.size()) - 1));
}