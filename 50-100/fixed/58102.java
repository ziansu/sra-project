@java.lang.Override
protected void applyPropertiesToServerData(de.fau.cs.mad.kwikshop.common.ShoppingList source, de.fau.cs.mad.kwikshop.common.ShoppingListServer target) {
    target.setName(source.getName());
    target.setSortTypeInt(source.getSortTypeInt());
    target.setLocation(source.getLocation());
    target.setLastModifiedDate(source.getLastModifiedDate());
}