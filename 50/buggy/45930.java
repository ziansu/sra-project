public int getNextTaskId() {
    if (freedIds.isEmpty()) {
        return (newTaskId)++;
    }else {
        return freedIds.poll();
    }
}