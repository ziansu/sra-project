public static de.tuberlin.dima.presslufthammer.data.ondisk.OnDiskDataStore openDataStore(java.io.File directory) throws java.io.IOException {
    if ((!(directory.exists())) && (directory.isDirectory())) {
        throw new java.io.IOException("Directory given in openDataStore does not exist or is not a directory.");
    }
    de.tuberlin.dima.presslufthammer.data.ondisk.OnDiskDataStore store = new de.tuberlin.dima.presslufthammer.data.ondisk.OnDiskDataStore(directory);
    store.openTablets();
    return store;
}