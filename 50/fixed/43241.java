public int getActualId(int displayId) throws java.util.NoSuchElementException {
    java.lang.Integer actualId = this.displayIDToActualIDMap.get(displayId);
    if (actualId == null) {
        throw new java.util.NoSuchElementException();
    }else {
        return actualId;
    }
}