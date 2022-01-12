public int getNextTaskId() {
    return freedIds.poll();
}