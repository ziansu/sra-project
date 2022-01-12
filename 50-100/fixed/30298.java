@java.lang.Override
public final java.util.Collection<?> getSortablePropertyIds() {
    final java.util.List<java.lang.Object> sortablePropertyIds = new java.util.ArrayList<java.lang.Object>();
    for (final java.lang.Object propertyId : propertyIds) {
        if (isPropertySortable(propertyId)) {
            sortablePropertyIds.add(propertyId);
        }
    }
    return sortablePropertyIds;
}