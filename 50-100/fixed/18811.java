@java.lang.Override
public boolean accept(java.io.File pathname) {
    if (pathname.isDirectory())
        return true;
    else
        if (pathname.isFile()) {
            java.lang.String fileName = pathname.getName();
            return fileName.toLowerCase().endsWith(".cls");
        }else {
            return false;
        }
    
}