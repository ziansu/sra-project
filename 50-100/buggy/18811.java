public boolean accept(java.io.File pathname) {
    if (pathname.isDirectory())
        return true;
    else
        if (pathname.isFile()) {
            java.lang.String fileName = pathname.getName();
            if (fileName.toLowerCase().endsWith(".cls"))
                return true;
            else
                return false;
            
        }else
            return false;
        
    
}