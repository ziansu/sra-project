@java.lang.Override
public File[] listFiles() {
    java.io.File[] files = super.listFiles();
    File[] myFiles = new File[files.length];
    for (int i = 0; i < (files.length); i++)
        myFiles[i] = new File(files[i].getAbsolutePath());
    
    return myFiles;
}