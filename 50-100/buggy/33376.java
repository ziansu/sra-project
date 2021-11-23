@java.lang.Override
public boolean accept(java.io.File file) {
    if ((file.isDirectory()) || ((extensions.size()) == 0)) {
        return true;
    }
    java.lang.String nomFichier = file.getName().toLowerCase();
    for (java.lang.String extension : extensions) {
        if (nomFichier.endsWith(extension)) {
            return true;
        }
    }
    return false;
}