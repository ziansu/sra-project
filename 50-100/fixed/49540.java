public synchronized void add(eu.antidotedb.fs.FsTree.FsElement p) {
    if (p instanceof eu.antidotedb.fs.FsTree.File)
        dirMapRef.register(p.name).set(eu.antidotedb.fs.FsTree.antidote.noTransaction(), new java.lang.String(((eu.antidotedb.fs.FsTree.File) (p)).contents.array()));
    else
        if (p instanceof eu.antidotedb.fs.FsTree.Directory)
            dirMapRef.map_aw(p.name).register(eu.antidotedb.fs.FsTree.DIRECTORY_MARKER).set(eu.antidotedb.fs.FsTree.antidote.noTransaction(), "");
        
    
}