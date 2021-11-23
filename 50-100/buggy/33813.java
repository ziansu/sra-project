public boolean setName(java.lang.String name) {
    if (!(file.exists()))
        return false;
    
    java.lang.String parent = file.getParent();
    java.io.File newFile = new java.io.File(parent, name);
    if (newFile.exists()) {
        java.lang.System.out.println("ERROR: File already exists 111 FileReaderWriter");
        return false;
    }
    if (!(file.renameTo(newFile))) {
        java.lang.System.out.println("ERROR: file not able to rename 116 FileReaderWriter");
        return false;
    }
    this.file = newFile;
    return true;
}