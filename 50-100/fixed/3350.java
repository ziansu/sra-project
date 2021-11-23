public boolean removeDenied(java.util.UUID uuid) {
    if (uuid == (com.intellectualcrafters.plot.database.DBFunc.everyone)) {
        boolean result = false;
        for (java.util.UUID other : new java.util.HashSet<>(getDenied())) {
            result = result || (rmvDenied(other));
        }
        return result;
    }
    return rmvDenied(uuid);
}