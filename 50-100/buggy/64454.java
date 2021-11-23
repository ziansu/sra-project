private void checkUnLock() {
    if ((nodeagent.indexToUnlock) != (-1)) {
        if (((nodeagent.indexToUnlock) >= 0) && ((nodeagent.indexToUnlock) < (totalFileList.size()))) {
            totalFileList.get(nodeagent.indexToLock).unLock();
            nodeagent.indexToUnlock = -1;
        }
    }
}