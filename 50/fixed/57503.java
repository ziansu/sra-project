public void removeAll(Adventure.Items.Item item) {
    inventory.remove(item);
    count.remove(inventory.indexOf(item));
    resetWeight();
}