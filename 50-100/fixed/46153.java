public int removeOldConflicts(org.rapla.storage.UpdateResult result, java.util.Date today) {
    int count = 0;
    for (java.util.Set<org.rapla.facade.Conflict> sortedSet : conflictMap.values()) {
        java.util.Iterator<org.rapla.facade.Conflict> it = sortedSet.iterator();
        while (it.hasNext()) {
            org.rapla.facade.Conflict conflict = it.next();
            if (endsBefore(conflict, today)) {
                it.remove();
                count++;
                result.addOperation(new org.rapla.storage.UpdateResult.Remove(conflict));
            }
        } 
    }
    return count;
}