public synchronized void mkdir(java.lang.String lastComponent) {
    dirMapRef.map_aw(lastComponent).register(eu.antidotedb.fs.FsTree.DIRECTORY_MARKER).set(eu.antidotedb.fs.FsTree.antidote.noTransaction(), "");
}