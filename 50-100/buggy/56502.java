private java.util.ArrayList<java.lang.Integer> findMatchedIds(java.lang.String keyword, java.util.ArrayList<java.lang.Integer> matchedTaskIds) {
    for (java.lang.Integer taskId : this.eventMap.keySet()) {
        Event event = this.eventMap.get(taskId);
        if (this.hasKeyWord(event, keyword)) {
            matchedTaskIds.add(taskId);
        }
        if ((matchedTaskIds.size()) == 0) {
            throw new java.util.NoSuchElementException(TaskData.messageNoResults);
        }
    }
    return matchedTaskIds;
}