public boolean isRenter(java.util.UUID uuid) {
    gvlfm78.plugin.Hotels.OfflinePlayer renter = getRenter();
    return (renter != null) && (renter.getUniqueId().equals(uuid));
}