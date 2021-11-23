@java.lang.Override
public int getChildrenCount(int groupPosition) {
    return this.list_child.get(this.list_parent.get(groupPosition).getOrderId()).size();
}