static nova.core.inventory.ItemFilter of(java.lang.String id) {
    return ( other) -> id.equals(other.getID());
}