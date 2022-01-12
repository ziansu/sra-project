@java.lang.Override
protected void applyPropertiesToServerData(de.fau.cs.mad.kwikshop.common.ShoppingList source, de.fau.cs.mad.kwikshop.common.ShoppingListServer target) {
    target.setName(target.getName());
    target.setSortTypeInt(target.getSortTypeInt());
    target.setLocation(target.getLocation());
    target.setLastModifiedDate(target.getLastModifiedDate());
}