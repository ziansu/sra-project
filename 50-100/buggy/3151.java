@java.lang.Override
public java.util.ArrayList<com.wagner.marcel.shoppinglist.Data.Itemdata.ShoppingItemNew> modify(java.util.ArrayList<com.wagner.marcel.shoppinglist.Data.Itemdata.ShoppingItemNew> list) {
    for (com.wagner.marcel.shoppinglist.Data.Itemdata.ShoppingItemNew s : list) {
        if ((s.isBought()) && (!(s.isPermanent()))) {
            list.remove(s);
        }
    }
    return list;
}