private int addParentWrapper(int parentWrapperPosition, com.jhj.expandablerecyclerview.model.ParentListItem newParentListItem) {
    com.jhj.expandablerecyclerview.model.ParentWrapper newParentWrapper = new com.jhj.expandablerecyclerview.model.ParentWrapper(newParentListItem);
    mItemList.add(parentWrapperPosition, newParentWrapper);
    int insertedItemCount = 1;
    if (newParentWrapper.isInitiallyExpanded()) {
        newParentWrapper.setExpanded(true);
        java.util.List<?> childItemList = newParentWrapper.getChildItemList();
        if (childItemList != null) {
            mItemList.addAll((parentWrapperPosition + insertedItemCount), childItemList);
            insertedItemCount += childItemList.size();
        }
    }
    return insertedItemCount;
}