public void longToken(long tok) {
    if (isStackHash()) {
        getStackHash().put(currentKey, new java.lang.Double(tok));
        currentKey = null;
    }else {
        getStackVec().add(new java.lang.Long(tok));
    }
}