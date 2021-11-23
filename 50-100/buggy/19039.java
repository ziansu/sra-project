@java.lang.Override
protected void applyPropertiesToClientData(de.fau.cs.mad.kwikshop.common.ShoppingListServer source, de.fau.cs.mad.kwikshop.common.ShoppingList target) {
    target.setName(target.getName());
    target.setSortTypeInt(target.getSortTypeInt());
    target.setLocation(target.getLocation());
    target.setLastModifiedDate(target.getLastModifiedDate());
    target.setServerVersion(source.getVersion());
    target.setServerId(source.getId());
}