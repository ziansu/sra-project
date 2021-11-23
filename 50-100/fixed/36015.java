public int calculateAddGroupStartIndex(com.v2tech.vo.Group group) {
    com.v2tech.view.widget.GroupListView.GroupItemData item = ((com.v2tech.view.widget.GroupListView.GroupItemData) (getItem(group)));
    int itemStartPos = getGroupItemPos(item);
    int startPos = itemStartPos + (getExpandGroupSize(group.getChildGroup()));
    return startPos + 1;
}