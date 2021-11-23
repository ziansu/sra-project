void addSubtree(cn.okayj.util.lineartree.DataNode preSibling, cn.okayj.util.lineartree.DataNode preVisibleSibling, cn.okayj.util.lineartree.DataNode subtree) {
    int basePosition = getBasePosition(preSibling, subtree);
    int baseVisibleListPosition = 0;
    boolean addToVisibleList = false;
    baseVisibleListPosition = getVisibleBasePosition(preVisibleSibling, subtree);
    if ((((mVisibleList) != null) && (subtree.isVisible())) && (baseVisibleListPosition >= 0)) {
        addToVisibleList = true;
    }
    addSubtree(basePosition, baseVisibleListPosition, subtree, addToVisibleList);
}