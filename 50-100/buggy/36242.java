java.lang.String[] getFilesInFolder(java.lang.String directory) {
    java.lang.String[] list = new java.io.File(directory).list();
    if ((list == null) || ((list.length) == 0))
        return null;
    
    list = this.sortFileList(list);
    for (java.lang.String item : list) {
    }
    if (list == null)
        return null;
    else
        return list;
    
}