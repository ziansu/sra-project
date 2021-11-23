public void setTrainHead(int head) {
    if (head != (target)) {
        target = head;
        recalculatePaths();
    }
}