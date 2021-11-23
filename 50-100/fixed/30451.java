@java.lang.Override
public File[] listFiles() {
    java.io.File[] files = super.listFiles();
    if (files == null)
        return new File[0];
    
    File[] myFiles = new File[files.length];
    for (int i = 0; i < (files.length); i++)
        myFiles[i] = new File(files[i].getAbsolutePath());
    
    return myFiles;
}