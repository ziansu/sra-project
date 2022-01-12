final java.util.ArrayList<javi.FileDescriptor.LocalFile> listDes(java.io.FilenameFilter fl) {
    java.io.File[] flist = fh.listFiles(fl);
    java.util.ArrayList<javi.FileDescriptor.LocalFile> dlist = new java.util.ArrayList<javi.FileDescriptor.LocalFile>(flist.length);
    for (java.io.File file : flist)
        dlist.add(javi.FileDescriptor.LocalFile.make(file));
    
    return dlist;
}