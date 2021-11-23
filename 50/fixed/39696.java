private boolean tryRegister() {
    if (freeIdExists()) {
        threadId.set(getFreeId());
        threadsIdList.set(threadId.get(), true);
        return true;
    }
    return false;
}