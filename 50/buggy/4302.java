@java.lang.Override
public void init(org.semanticweb.ontop.pivotalrepr.impl.tree.ConstructionNode rootConstructionNode) {
    boolean hasBeenInitialized = (tree) == null;
    if (hasBeenInitialized)
        throw new java.lang.IllegalArgumentException("Already initialized IntermediateQueryBuilder.");
    
    tree = new org.semanticweb.ontop.pivotalrepr.impl.tree.DefaultTree(rootConstructionNode);
    canEdit = true;
}