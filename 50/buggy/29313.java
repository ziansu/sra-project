@java.lang.Override
public boolean accept(java.io.File file) {
    if (file.isDirectory()) {
        for (java.lang.String folder : folderNames) {
            if (file.getName().contains(folder)) {
                return true;
            }
        }
    }
    return false;
}