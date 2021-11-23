public tcg.tree.ITreeObject findRootLevelTreeObjectByContentDescription(java.lang.String description) {
    for (tcg.tree.ITreeObject treeObject : ((tcg.tree.TreeParent) (treeInstanceRoot)).getChildren()) {
        if (description.equals(treeObject.getContent().getDescription()))
            return treeObject;
        
    }
    return null;
}