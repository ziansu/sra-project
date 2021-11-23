public boolean paste(com.mauriciotogneri.fileexplorer.models.FileInfo target) {
    boolean allPasted = true;
    try {
        for (com.mauriciotogneri.fileexplorer.models.FileInfo fileInfo : items) {
            allPasted &= fileInfo.copy(target, ((mode) == (com.mauriciotogneri.fileexplorer.models.Clipboard.Mode.CUT)));
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    items.clear();
    mode = com.mauriciotogneri.fileexplorer.models.Clipboard.Mode.NONE;
    parent = null;
    return allPasted;
}