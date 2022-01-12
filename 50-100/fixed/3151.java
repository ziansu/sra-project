@java.lang.Override
public java.util.ArrayList<com.wagner.marcel.shoppinglist.Data.Itemdata.ShoppingItemNew> modify(java.util.ArrayList<com.wagner.marcel.shoppinglist.Data.Itemdata.ShoppingItemNew> list) {
    java.util.ArrayList<com.wagner.marcel.shoppinglist.Data.Itemdata.ShoppingItemNew> delete = new java.util.ArrayList<>();
    for (com.wagner.marcel.shoppinglist.Data.Itemdata.ShoppingItemNew s : list) {
        if ((s.isBought()) && (!(s.isPermanent()))) {
            delete.add(s);
        }
    }
    for (com.wagner.marcel.shoppinglist.Data.Itemdata.ShoppingItemNew s : delete) {
        list.remove(s);
    }
    return list;
}