protected java.lang.Boolean checkInstall() {
    if (installed)
        return ;
    
    java.io.File f = new java.io.File(installPath);
    if ((f.exists()) && (!(f.isDirectory()))) {
        return true;
    }else {
        return false;
    }
}