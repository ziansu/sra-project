public final void backup(java.lang.String extension) throws java.io.IOException {
    javi.FileDescriptor.LocalFile file2 = FileDescriptor.LocalFile.make(((prop.fdes.shortName) + extension));
    if ((!(prop.fdes.canWrite())) && ("Microsoft Corp.".equals(java.lang.System.getProperty("java.vendor"))))
        history.Tools.execute(null, ("d:\\cygwin\\bin\\chmod +w " + (prop.fdes.canonName)));
    
    prop.fdes.renameTo(file2);
    prop.fdes.writeAll(getStringIter(), prop.getSeperator());
    setReadOnly(false);
}