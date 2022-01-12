@org.jetbrains.annotations.Nullable
org.apache.ignite.internal.processors.igfs.IgfsPathsCreateResult createDirectory(org.apache.ignite.internal.processors.igfs.IgfsPathIds pathIds, java.util.Map<org.apache.ignite.lang.IgniteUuid, org.apache.ignite.internal.processors.igfs.IgfsEntryInfo> lockInfos, java.util.Map<java.lang.String, java.lang.String> dirProps) throws org.apache.ignite.IgniteCheckedException {
    if (lockInfos.get(pathIds.lastExistingId()).isFile())
        throw new org.apache.ignite.igfs.IgfsParentNotDirectoryException(("Failed to create directory (parent " + "element is not a directory)"));
    
    return createFileOrDirectory(true, pathIds, lockInfos, dirProps, null, 0, null, false, null);
}