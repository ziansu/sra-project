@java.lang.Override
protected void applyPropertiesToClientData(de.fau.cs.mad.kwikshop.common.ShoppingListServer source, de.fau.cs.mad.kwikshop.common.ShoppingList target) {
    target.setName(source.getName());
    target.setSortTypeInt(source.getSortTypeInt());
    target.setLocation(source.getLocation());
    target.setLastModifiedDate(source.getLastModifiedDate());
    target.setServerVersion(source.getVersion());
    target.setServerId(source.getId());
}