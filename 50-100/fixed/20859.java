public void RemoveItem(Items.Item item) {
    java.util.Iterator<Items.Item> iterator = inventory.iterator();
    while (iterator.hasNext()) {
        if ((iterator.next()) == item) {
            iterator.remove();
            return ;
        }
    } 
}