public void addUpdate(com.lagopusempire.basicupdater.Update<V, U> update) {
    if (update == null) {
        throw new java.lang.IllegalArgumentException("Update cannot be null.");
    }
    V from = update.getFrom();
    if (updates.containsKey(from)) {
        updates.remove(from);
        throw new com.lagopusempire.basicupdater.DuplicateUpdateException(updates.get(from), update);
    }
    updates.put(from, update);
}