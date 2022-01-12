@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (!(obj instanceof sp.FileInfo)) {
        return false;
    }
    sp.FileInfo fileInfo = ((sp.FileInfo) (obj));
    return (name.equals(fileInfo.name)) && (isDir.equals(fileInfo.isDir));
}