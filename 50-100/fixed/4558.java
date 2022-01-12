public tcg.tree.ITreeObject findRootLevelTreeObjectByContentDescription(java.lang.String description) {
    if ((treeInstanceRoot) == null)
        return null;
    
    for (tcg.tree.ITreeObject treeObject : ((tcg.tree.TreeParent) (treeInstanceRoot)).getChildren()) {
        if (description.equals(treeObject.getContent().getDescription()))
            return treeObject;
        
    }
    return null;
}