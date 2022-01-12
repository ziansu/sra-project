public void sendPackage(de.fu_berlin.agdb.nio_tools.core.DataPackage dataPackage, java.nio.channels.SelectionKey selectionKey) {
    java.util.List<de.fu_berlin.agdb.nio_tools.core.DataPackage> writeDataQueue = writeDataMap.get(selectionKey);
    writeDataQueue.remove(0);
    if ((writeDataQueue.size()) == 0) {
        writeDataMap.remove(selectionKey);
        selectionKey.interestOps(java.nio.channels.SelectionKey.OP_READ);
    }
}