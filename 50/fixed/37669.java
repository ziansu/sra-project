public void setPath(java.lang.String libName, java.io.File dir) {
    setPathContext(libName, com.nec.congenio.impl.path.SearchPath.create(dir, this));
}