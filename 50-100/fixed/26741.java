@java.lang.Override
public org.apache.ignite.igfs.IgfsPathSummary call() throws java.lang.Exception {
    if (log.isDebugEnabled())
        log.debug(("Calculating path summary: " + path));
    
    org.apache.ignite.lang.IgniteUuid fileId = meta.fileId(path);
    if (fileId == null)
        throw new org.apache.ignite.igfs.IgfsPathNotFoundException(("Failed to get path summary (path not found): " + path));
    
    org.apache.ignite.igfs.IgfsPathSummary sum = new org.apache.ignite.igfs.IgfsPathSummary(path);
    summary0(info(path), sum);
    return sum;
}