public edu.utsa.fileflow.filestructure.FileStruct insert(edu.utsa.fileflow.filestructure.FileStruct fs) {
    fs.parent = this;
    edu.utsa.fileflow.filestructure.FileStruct node = files.put(fs.name, fs);
    return node;
}