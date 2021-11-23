public void remove(int amount, Adventure.Items.Item item) {
    remove(amount, inventory.get(inventory.indexOf(item)));
}