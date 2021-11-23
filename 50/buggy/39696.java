private boolean tryRegister() {
    if (freeIdExists()) {
        threadId.set(getFreeId());
        return threadsIdList.set(threadId.get(), true);
    }
    return false;
}