private short SONOpenOldFile(java.lang.String path, int mode) throws son32reader.SonNoAccessException, son32reader.SonNoFileException, son32reader.SonOutOfMemoryException, son32reader.SonReadOnlyException {
    short fh = son32reader.Son32Reader.INSTANCE.SONOpenOldFile(path, mode);
    java.lang.System.out.println(fh);
    switch (fh) {
        case -1 :
            throw new son32reader.SonNoFileException(path);
        case -4 :
            throw new son32reader.SonNoAccessException(path);
        case -8 :
            throw new son32reader.SonOutOfMemoryException();
        case -21 :
            throw new son32reader.SonReadOnlyException(path);
    }
    return fh;
}