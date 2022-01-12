public boolean isPriest(java.util.UUID believerId) {
    if (believerId == null) {
        return false;
    }
    java.util.Set<java.lang.String> gods = getAllGods();
    for (java.lang.String godName : gods) {
        java.util.List<java.util.UUID> list = getPriestsForGod(godName);
        if ((list != null) && (list.contains(believerId))) {
            return true;
        }
    }
    return false;
}