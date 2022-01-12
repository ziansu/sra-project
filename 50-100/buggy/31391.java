private boolean hasSubItemsSelected(int startPosition, java.util.List<T> subItems) {
    for (T subItem : subItems) {
        if ((eu.davidea.flexibleadapter.FlexibleAdapter.isSelected((startPosition + 1))) || ((isExpandable(subItem)) && (hasSubItemsSelected((startPosition + 1), getExpandableList(((eu.davidea.flexibleadapter.items.IExpandable) (subItem)))))))
            return true;
        
    }
    return false;
}