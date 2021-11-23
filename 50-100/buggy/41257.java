private static void deleteFolder(final java.io.File folder) {
    final java.io.File[] files = folder.listFiles();
    if (files != null) {
        for (final java.io.File f : files) {
            boolean _isDirectory = f.isDirectory();
            if (_isDirectory) {
                fr.emn.atlanmod.atl2boogie.xtend.lib.URIs.deleteFolder(f);
            }else {
                f.delete();
            }
        }
    }
    folder.delete();
}