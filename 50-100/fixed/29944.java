@java.lang.Override
public java.util.List<java.io.File> getPathsToFiles(java.lang.String rootDirectory) {
    ru.breathoffreedom.mvc.services.vfs.VFSImpl.FileIterator iterator = new ru.breathoffreedom.mvc.services.vfs.VFSImpl.FileIterator(rootDirectory);
    java.util.List<java.io.File> listOfFiles = new java.util.ArrayList<>();
    while (iterator.hasNext()) {
        listOfFiles.add(iterator.next());
    } 
    return listOfFiles;
}