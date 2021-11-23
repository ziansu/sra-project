@java.lang.Override
public int getItemCount() {
    int childrenSize = 0;
    for (G item : data) {
        childrenSize += item.getChildrenCount();
    }
    return (data.size()) + childrenSize;
}