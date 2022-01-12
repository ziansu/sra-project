private void checkSingleCollapseMode(int currCollapsedParentPosition) {
    if ((mExpandCollapseMode.mode) != (com.github.huajianjiang.expandablerecyclerview.widget.ExpandableAdapter.ExpandCollapseMode.MODE_SINGLE_COLLAPSE))
        return ;
    
    final int lastCollapsedPosition = mExpandCollapseMode.lastCollapsedPosition;
    if (currCollapsedParentPosition == lastCollapsedPosition)
        return ;
    
    com.github.huajianjiang.expandablerecyclerview.util.Logger.e(com.github.huajianjiang.expandablerecyclerview.widget.ExpandableAdapter.TAG, (("checkSingleCollapseMode " + "---->lastCollapsedPosition=*") + lastCollapsedPosition));
    expandView(lastCollapsedPosition, true, false);
    mExpandCollapseMode.lastCollapsedPosition = currCollapsedParentPosition;
}