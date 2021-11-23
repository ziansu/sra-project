private static void maybeStoreSymlink(com.google.devtools.build.lib.vfs.PathFragment linkName, com.google.devtools.build.lib.vfs.PathFragment linkTarget, java.lang.String metadata, com.google.devtools.build.lib.vfs.PathFragment destPath, java.util.Map<com.google.devtools.build.lib.vfs.PathFragment, com.google.devtools.build.lib.actions.FilesetOutputSymlink> result) {
    linkName = destPath.getRelative(linkName);
    if (!(result.containsKey(linkName))) {
        result.put(linkName, new com.google.devtools.build.lib.actions.FilesetOutputSymlink(linkName, linkTarget, metadata));
    }
}