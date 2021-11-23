@java.lang.Override
public boolean accept(java.io.File pathname) {
    if (pathname.isHidden())
        return false;
    
    if (!(pathname.canRead()))
        return false;
    
    return true;
}