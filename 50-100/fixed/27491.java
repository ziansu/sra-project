@java.lang.Override
public void loadState(java.io.DataInputStream in, int snapshotVersion) throws java.io.IOException {
    items.clear();
    copyOnWrite.clear();
    int fileVersion = (snapshotVersion >= 3) ? in.readInt() : 0;
    int numItems = in.readInt();
    while ((numItems--) > 0) {
        io.tetrapod.raft.storage.StorageItem item = new io.tetrapod.raft.storage.StorageItem(in, fileVersion);
        items.put(item.key, item);
    } 
}