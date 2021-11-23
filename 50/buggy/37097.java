public Adventure.Items.Item remove(int amount, java.lang.String itemName) {
    remove(amount, findIndex(itemName));
}