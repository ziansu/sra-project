public void longToken(long tok) {
    if (isStackHash()) {
        getStackHash().put(currentKey, new java.lang.Long(tok));
        currentKey = null;
    }else {
        getStackVec().add(new java.lang.Long(tok));
    }
}