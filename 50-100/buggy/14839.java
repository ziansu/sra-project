@java.lang.Override
public void run() {
    try {
        java.io.File f = get0(archive, file);
        if (thrw && (f == null))
            throw new java.io.FileNotFoundException(("" + archive));
        
        deferred.resolve(f);
    } catch (java.lang.Throwable e) {
        deferred.fail(e);
    }
}