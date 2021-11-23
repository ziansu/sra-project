@java.lang.Override
public java.util.List<java.lang.String> getPathsToFiles(java.lang.String rootDirectory) {
    java.lang.System.out.println("VFSImpl getPathsToFiles is called");
    ru.breathoffreedom.mvc.services.vfs.VFSImpl.FileIterator iterator = new ru.breathoffreedom.mvc.services.vfs.VFSImpl.FileIterator(rootDirectory);
    java.util.List<java.lang.String> listOfFiles = new java.util.ArrayList<>();
    while (iterator.hasNext()) {
        listOfFiles.add(iterator.next());
    } 
    return listOfFiles;
}