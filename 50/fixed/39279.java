static nova.core.inventory.ItemFilter of(int amount) {
    return ( other) -> (other.count()) >= amount;
}