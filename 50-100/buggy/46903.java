public com.footopia.shoppinglist.ShoppingItem editItemInShoppingList(com.footopia.shoppinglist.ShoppingItem si) {
    java.lang.System.out.println(com.footopia.shoppinglist.MemDB.dbAllItems);
    java.lang.System.out.println(si.getName());
    si.setId(getId(si.getName()));
    java.lang.System.out.println(si);
    int index = locateItem(si.getId(), com.footopia.shoppinglist.MemDB.dbShoppingList);
    if (index == (-1)) {
        return null;
    }else {
        com.footopia.shoppinglist.MemDB.dbShoppingList.remove(index);
        com.footopia.shoppinglist.MemDB.dbShoppingList.add(index, si);
        return si;
    }
}