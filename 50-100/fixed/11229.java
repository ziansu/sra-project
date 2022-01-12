private void checkSingleExpandMode(int currExpandedParentPosition) {
    if ((mExpandCollapseMode.mode) != (com.github.huajianjiang.expandablerecyclerview.widget.ExpandableAdapter.ExpandCollapseMode.MODE_SINGLE_EXPAND))
        return ;
    
    final int lastExpandedPosition = mExpandCollapseMode.lastExpandedPosition;
    if (lastExpandedPosition == currExpandedParentPosition)
        return ;
    
    com.github.huajianjiang.expandablerecyclerview.util.Logger.e(com.github.huajianjiang.expandablerecyclerview.widget.ExpandableAdapter.TAG, (("checkSingleExpandMode " + "---->lastExpandedPosition=*") + lastExpandedPosition));
    collapseView(lastExpandedPosition, true, false);
    mExpandCollapseMode.lastExpandedPosition = currExpandedParentPosition;
}