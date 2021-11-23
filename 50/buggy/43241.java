public int getActualId(int displayId) throws java.util.NoSuchElementException {
    assertObjectNotNull(this);
    java.lang.Integer actualId = this.displayIDToActualIDMap.get(displayId);
    if (actualId == null) {
        throw new java.util.NoSuchElementException();
    }else {
        return actualId;
    }
}