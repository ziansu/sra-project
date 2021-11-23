static nova.core.inventory.ItemFilter of(java.lang.String id) {
    return ( other) -> {
        return id.equals(other.getID());
    };
}