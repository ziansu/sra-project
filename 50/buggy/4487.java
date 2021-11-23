public boolean containsKey(java.lang.String uuid) {
    return (table.getIfPresent(uuid)) != null;
}