java.lang.String[] getFilesInFolder(java.lang.String directory) {
    java.lang.String[] list = new java.io.File(directory).list();
    if ((list == null) || ((list.length) == 0))
        return null;
    
    list = this.sortFileList(list);
    if (list == null)
        return null;
    else
        return list;
    
}