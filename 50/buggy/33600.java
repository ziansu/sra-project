public boolean isOwnedBy(de.wolfi.minopoly.components.Player player) {
    return (this.isOwned()) & (this.getOwner().equals(player));
}