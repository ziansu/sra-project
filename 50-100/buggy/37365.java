public java.util.ArrayList<java.lang.Integer> searchByKeyword(java.lang.String keyword) throws java.util.NoSuchElementException {
    java.util.ArrayList<java.lang.Integer> matchedTaskIds = new java.util.ArrayList<java.lang.Integer>();
    assertObjectNotNull(this);
    if (this.eventMap.isEmpty()) {
        throw new java.util.NoSuchElementException(TaskData.messageEmptyFile);
    }else {
        matchedTaskIds = findMatchedIds(keyword, matchedTaskIds);
    }
    return matchedTaskIds;
}