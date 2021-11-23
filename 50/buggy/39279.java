static nova.core.inventory.ItemFilter of(int amount) {
    return ( other) -> {
        return (other.count()) >= amount;
    };
}