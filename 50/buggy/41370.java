public boolean contains(Adventure.Items.Item item) {
    for (Adventure.Items.Item i : inventory) {
        return i == item;
    }
    return false;
}