@java.lang.Override
public boolean accept(java.io.File f) {
    if (f.isDirectory())
        return true;
    
    java.lang.String extension = net.agspace.Utils.getExtension(f);
    if (extension != null)
        return net.agspace.Window.OPEN_FILE_EXTENSIONS.contains(extension.toLowerCase());
    else
        return false;
    
}