public void activateNextPrimaryActiveFight() {
    com.google.common.collect.Interner<java.lang.String> interner = com.google.common.collect.Interners.newWeakInterner();
    synchronized(interner.intern(getPlayerId())) {
        if ((getPrimaryActiveFight()) == null) {
            if ((activeFights.size()) > 0) {
                activeFights.get(activeFights.firstKey()).setIsPrimary(true);
            }
        }
    }
}