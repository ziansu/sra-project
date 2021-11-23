private boolean freeIdExists() {
    boolean freeIdFlag = false;
    for (boolean idFlag : threadsIdList) {
        if (!idFlag) {
            freeIdFlag = true;
        }
    }
    return freeIdFlag;
}